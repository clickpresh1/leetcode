class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int x = 0;
        int y = 0;
        int k = 0;

        while ((x < nums1.length) && (y < nums2.length)) {
            if (nums1[x] == nums2[y]) {
                nums1[k] = nums1[x];
                x += 1;
                y += 1;
                k += 1;
            } else if (nums1[x] > nums2[y]) {
                y += 1;
            } else {
                x += 1;
            }
        } 

        return Arrays.copyOfRange(nums1, 0, k);
    }
}
