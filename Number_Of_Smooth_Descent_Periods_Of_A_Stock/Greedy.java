class Solution {
    public long getDescentPeriods(int[] prices) {
        int m = prices.length, runCnt = 1;
        long mx = runCnt;
        
        for (int i = 1; i < m; i++) {
            if (prices[i - 1] - prices[i] == 1) runCnt++;
            else runCnt = 1;

            mx += runCnt;
        } 

        return mx;
    }
}
