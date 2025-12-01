class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int k = 0;
        int[] arr = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    k = j;
                    break;
                }
            } 

            for (int j = k + 1; j < nums2.length; j++) {
                if (nums2[j] > nums1[i]) {
                    nums1[i] = nums2[j];
                    arr[i] = 1;
                    break;
                } 
            } 

            if (arr[i] == 0) nums1[i] = -1;

        } 

        return nums1;
    }
}
