class Solution {
    public int climbStairs(int n) {
        int m = n;

        if (m == 1) return 1;
        if (m == 2) return 2;

        int[] dp = new int[m + 1];

        dp[0] = 1; dp[1] = 1;
        for (int i = 2; i < m + 1; i++) dp[i] = dp[i - 1] + dp[i - 2];

        return dp[m];
    }
}
