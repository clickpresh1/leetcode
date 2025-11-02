class Solution {
    public boolean hasAlternatingBits(int n) {
        int x = n;
        int b = x & 1;

        int y = n >> 1;;
        int c = y & 1;

        if (b == c) return false;

        while (((x >> 2) != 0) || ((y >> 2) != 0)) {
            x >>= 2;
            if ((x & 1) != b) return false;

            y >>= 2;
            if ((y & 1) != c) return false;
        }

        return true;
    }
}
