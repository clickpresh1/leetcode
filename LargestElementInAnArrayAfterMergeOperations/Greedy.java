class Solution {
    public long maxArrayValue(int[] nums) {
        int m = nums.length;
        long max = 0, currMax = nums[m - 1];

        if (m == 1) return nums[0];

        for (int i = m - 2; i >= 0; i--) {
            if (nums[i] <= currMax) currMax += nums[i];
            else currMax = nums[i];

            if (currMax > max) max = currMax;
        } 

        return max;
    }
}
