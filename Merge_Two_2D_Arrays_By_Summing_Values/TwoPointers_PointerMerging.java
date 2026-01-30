class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int m = nums1.length, n = nums2.length, len = 0;

        int x = 0, y = 0;
        while ((x < m) && (y < n)) {
            if (nums1[x][0] == nums2[y][0]) {x++; y++;}
            else if (nums1[x][0] < nums2[y][0]) x++;
            else y++; 

            len++;
        } 

        len += (m - x) + (n - y);

        int[][] res = new int[len][2];
        int j = 0;
        x = 0; y = 0;
        while ((x < m) && (y < n)) {
            if (nums1[x][0] == nums2[y][0]) {
                res[j][0] = nums1[x][0];
                res[j++][1] = nums1[x++][1] + nums2[y++][1];
            } else if (nums1[x][0] < nums2[y][0]) {
                res[j][0] = nums1[x][0];
                res[j++][1] = nums1[x++][1];
            } else if (nums1[x][0] > nums2[y][0]) {
                res[j][0] = nums2[y][0];
                res[j++][1] = nums2[y++][1];
            }
        } 

        while (x < m) {
            res[j][0] = nums1[x][0];
            res[j++][1] = nums1[x++][1];
        } 

        while (y < n) {
            res[j][0] = nums2[y][0];
            res[j++][1] = nums2[y++][1];
        } 

        return res;
    }
}
