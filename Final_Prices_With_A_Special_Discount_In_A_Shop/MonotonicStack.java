class Solution {
    public int[] finalPrices(int[] prices) {
        int m = prices.length;
        Deque<Integer> q = new ArrayDeque<>();

        for (int i = 0; i < m; i++) {
            int curr = prices[i];

            while (!q.isEmpty()) {
                int p = q.peek();
                if (prices[p] >= curr) {
                    int k = q.pop();
                    prices[k] -= curr;
                } else break;
            } 

            q.push(i);
        } 

        return prices;

    }
}
