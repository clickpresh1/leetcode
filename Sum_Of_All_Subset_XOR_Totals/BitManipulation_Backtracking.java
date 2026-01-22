class Solution {
    public int subsetXORSum(int[] nums) {
        int m = nums.length, b = 0;

        int[] sum = new int[1];

        backtrack(nums, 0, b, sum);

        return sum[0];
    } 

    public static void backtrack(int[] nums, int x, int b, int[] sum) {
        int m = nums.length;

        sum[0] += b;

        for (int i = x; i < m; i++) {
            int k = nums[i];
            b ^= k;
            
            backtrack(nums, i + 1, b, sum);

            b = b ^ k;
        }
    } 
}
