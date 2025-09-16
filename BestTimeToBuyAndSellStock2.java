class Solution {
    public int maxProfit(int[] prices) {
        int starter = prices[0];
        int sum = 0;
        for (int i = 0; i < prices.length; i++) {
            int val = prices[i] - starter;
            if (val > 0) {
                sum += val;
            }
            starter = prices[i];
        } 

        return sum;
    } 

}
