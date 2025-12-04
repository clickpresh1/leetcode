class Solution {
    public int alternatingSum(int[] nums) {
        int sum = 0, sign = -1;

        for (int i = 0; i < nums.length; i++) sum += (sign *= -1) * nums[i];

        return sum;
    } 
}
