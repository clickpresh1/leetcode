class Solution {
    public int sumOfSquares(int[] nums) {
        int m = nums.length, sum = 0;

        for (int i = 1; i <= m; i++) {
            if (m % i == 0) sum += (nums[i - 1] * nums[i - 1]);
        } 

        return sum;
    }
}
