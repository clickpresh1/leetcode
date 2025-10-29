class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int x = m - 1;
        int y = n - 1;
        int i = m + n - 1;

        while (i >= 0) {
            if ((x >= 0) && (y >= 0)) {
                if (nums1[x] >= nums2[y]) {
                    nums1[i] = nums1[x];
                    x -= 1;
                } else {
                    nums1[i] = nums2[y];
                    y -= 1;
                }
            } else if ((x >= 0) && (y < 0)) {
                nums1[i] = nums1[x];
                x -= 1;
            } else if ((x < 0) && (y >= 0)) {
                nums1[i] = nums2[y];
                y -= 1;
            } 

            i -= 1;
        }
    }
}
