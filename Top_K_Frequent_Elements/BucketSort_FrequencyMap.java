class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int m = nums.length, mx = -10001, mn = 10001;
        int[] map = new int[20001];

        for (int item : nums) {
            item += 10000;

            if (item > mx) mx = item;
            if (item < mn) mn = item;

            map[item]++;
        } 

        List<Integer>[] bucks = new ArrayList[m + 1];

        for (int i = mn; i < mx + 1; i++) {
            int f = map[i];

            if (f == 0) continue;

            if (bucks[f] == null) bucks[f] = new ArrayList<>();

            bucks[f].add(i - 10000);
        } 

        int q = 0;
        int[] res = new int[k];
        for (int i = m; i >= 0; i--) {
            List<Integer> b = bucks[i];

            if (b == null) continue;

            Collections.sort(b);

            for (int j = b.size() - 1; j >= 0; j--) {
                res[q++] = b.get(j);

                if (q == k) return res;
            } 
        } 

        return res;
    }
}
