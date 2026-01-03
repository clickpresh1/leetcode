class Solution {
    public int[] finalPrices(int[] prices) {
        int m = prices.length;
        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            int j = i + 1, curr = prices[i];
            while (j < m) {
                if (curr >= prices[j]) {
                    curr -= prices[j];
                    break;
                } 

                j++;
            } 

            arr[i] = curr;
        } 

        return arr;
    }
}
