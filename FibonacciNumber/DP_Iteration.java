class Solution {
    public int fib(int n) {
        int m = n;

        if (m == 0) return m;
        
        int[] dp = new int[m + 1];

        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i < m + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        } 

        return dp[m];
    }
}
