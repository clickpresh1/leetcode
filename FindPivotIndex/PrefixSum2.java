class Solution {
    public int pivotIndex(int[] nums) {
        int m = nums.length, sum = 0, leftSum = 0;
        
        for (int i = 0; i < m; i++) sum += nums[i];

        for (int i = 0; i < m; i++) {
            int rightSum = sum - leftSum - nums[i];

            if (rightSum == leftSum) return i;

            leftSum += nums[i];
        }

        return -1;
    }
}
