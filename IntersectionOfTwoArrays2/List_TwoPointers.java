class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();

        int x = 0;
        int y = 0;

        while ((x < nums1.length) && (y < nums2.length)) {
            if (nums1[x] == nums2[y]) {
                list.add(nums1[x]);
                x += 1;
                y += 1;
            } else if (nums1[x] > nums2[y]) {
                y += 1;
            } else {
                x += 1;
            }
        } 

        int[] res = new int[list.size()];
        int j = 0;
        for (int item : list) {
            res[j++] = item;
        } 

        return res;
    }
}
