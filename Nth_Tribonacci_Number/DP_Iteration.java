class Solution {
    public int tribonacci(int n) {
        int m = n;

        if (m <= 1) return m;

        int[] dp = new int[m + 1];

        dp[0] = 0; dp[1] = 1; dp[2] = 1;

        for (int i = 3; i < m + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        } 

        return dp[m];
    }
}
