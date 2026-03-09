class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int k = 0;
        
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    k = j;
                    break;
                }
            } 

            int temp = nums1[i];
            nums1[i] = -1;
            for (int j = k + 1; j < nums2.length; j++) {
                if (nums2[j] > temp) {
                    nums1[i] = nums2[j];
                    break;
                } 
            } 
        } 

        return nums1;
    }
}
