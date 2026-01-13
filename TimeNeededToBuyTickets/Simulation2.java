class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int m = tickets.length, count = 0, x = tickets[k];

        for (int i = 0; i < m; i++) {
            if (i <= k) count += (tickets[i] < x) ? tickets[i] : x;
            else count += (tickets[i] < (x - 1)) ? tickets[i] : (x - 1);
        } 

        return count;
    }
}
