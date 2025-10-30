class Solution {
    public int minChanges(int n, int k) {
        if (n == k) return 0;

        int x = n ^ k;
        int tempX = x;
        int c1 = 0;

        while (tempX != 0) {
            if ((tempX & 1) == 1) c1 += 1;

            tempX >>= 1;
        } 

        int y = x & n;
        int c2 = 0;
        while (y != 0) {
            if ((y & 1) == 1) c2 += 1;

            y >>= 1;
        }

        if (c1 == c2) return c1;
        else return -1;
    }
}
