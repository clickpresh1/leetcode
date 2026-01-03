class Solution {
    public int maxProduct(int[] nums) {
        int max = 0, maxIndx = 0, max2 = 0, max2Indx = 0;
        int m = nums.length;

        for (int i = 0; i < m; i++) {
            if (nums[i] > max) {
                max2 = max;
                max2Indx = maxIndx;

                max = nums[i];
                maxIndx = i;
            } else if (nums[i] > max2) {
                max2 = nums[i];
                max2Indx = i;
            }
        } 

        return --nums[maxIndx] * --nums[max2Indx];
    }
}
