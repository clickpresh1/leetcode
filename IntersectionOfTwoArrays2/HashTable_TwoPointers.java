class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        Map<Integer, Integer> map = new HashMap();

        int x = 0;
        int y = 0;
        int count = 0;

        while ((x < nums1.length) && (y < nums2.length)) {
            if (nums1[x] == nums2[y]) {
                if (!(map.containsKey(nums1[x]))) {
                    map.put(nums1[x], 1);
                } else {
                    int val = map.get(nums1[x]);
                    map.put(nums1[x], val + 1);
                } 

                count += 1;
                x += 1;
                y += 1;
            } else if (nums1[x] > nums2[y]) {
                y += 1;
            } else {
                x += 1;
            }
        } 

        int[] res = new int[count];
        int j = 0;
        for (int key : map.keySet()) {
            for (int k = 0; k < map.get(key); k++) {
                res[j++] = key;
            }
        } 

        return res;
    }
}
