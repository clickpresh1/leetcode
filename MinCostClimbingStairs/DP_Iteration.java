class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int m = cost.length;
        int[] dp = new int[m + 1];

        dp[0] = 0;
        dp[1] = 0;

        for (int i = 2; i < m + 1; i++) {
            int a = cost[i - 1] + dp[i - 1];
            int b = cost[i - 2] + dp[i - 2];

            dp[i] = Math.min(a, b);
        } 

        return dp[m];
    }
}
