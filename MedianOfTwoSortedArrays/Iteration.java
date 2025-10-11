// i'm not sure if this is brute force or not
// it beat 100.00%, with a 1ms runtime
// but it looks like brute force to me, since i used a for-loop to partially traverse the merged array twice
// so, i'll just call it Iterator.java for now

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int k = m + n;
        int[] arr = new int[k];

        int x = 0;
        int y = 0;
        int z = 0;

        while (z < k) {
            if ((x >= m) || (y >= n)) {
                break;
            } 

            if ((nums1[x] <= nums2[y])) {
                arr[z] = nums1[x];
                x += 1;
                z += 1;
            } else {
                arr[z] = nums2[y];
                y += 1;
                z += 1;
            } 
        } 

        if (x == m) {
            for (int i = (x + y); i < k; i++) {
                arr[i] = nums2[i - x];
            }
        } 
        if (y == n) {
            for (int i = (x + y); i < k; i++) {
                arr[i] = nums1[i - y];
            }
        } 

        int mid = k / 2;

        if (k % 2 == 0) {
            return (arr[mid] + arr[mid - 1]) / 2.0;
        } else {
            return arr[mid];
        }
    }
}
