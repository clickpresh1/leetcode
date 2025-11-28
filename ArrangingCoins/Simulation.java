class Solution {
    public int arrangeCoins(int n) {
        int count = 0;
        int x = 1;
        n -= x;

        while (n >= 0) {
            count += 1;
            x += 1;
            n -= x;
        } 

        return count;
    }
}
