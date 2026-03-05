class Solution {
    public int longestConsecutive(int[] nums) {
        int m = nums.length;
        Map<Integer, Integer> roots = new HashMap<>();

        for (int item : nums) roots.put(item, item);

        for (int item1 : roots.keySet()) {
            if (!roots.containsKey(item1 + 1)) continue; 

            int a = root(roots, item1), b = root(roots, item1 + 1);

            if (a != b) roots.put(b, a);
        } 

        Map<Integer, Integer> map = new HashMap<>();
        for (int item : roots.keySet()) {
            int endRoot = root(roots, item);
            roots.put(item, endRoot);
            map.put(endRoot, map.getOrDefault(endRoot, 0) + 1);
        } 

        int mxLen = 0;
        for (int item : map.values()) if (item > mxLen) mxLen = item;

        return mxLen;
    } 

    public static int root(Map<Integer, Integer> roots, int x) {
        if (roots.get(x) == x) return x;

        int r = root(roots, roots.get(x));
        roots.put(x, r);

        return r;
    }
}
