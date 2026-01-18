class Solution {
    public int maxAscendingSum(int[] nums) {
        int m = nums.length, sum = nums[0], max = sum;

        for (int i = 1; i < m; i++) {
            if (nums[i] > nums[i - 1]) sum += nums[i];
            else sum = nums[i];

            if (sum > max) max = sum;
        } 

        return max;
    }
}
