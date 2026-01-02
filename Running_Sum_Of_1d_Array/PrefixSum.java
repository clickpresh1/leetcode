class Solution {
    public int[] runningSum(int[] nums) {
        int m = nums.length;

        for (int i = 1; i < m; i++) nums[i] += nums[i - 1];

        return nums;
    }
}
