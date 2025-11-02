class Solution {
    public boolean hasAlternatingBits(int n) {
        int x = n, b = x & 1;

        int y = n >> 1, c = y & 1;

        if (b == c) return false;

        while (((x >> 2) != 0) || ((y >> 2) != 0)) {
            if (((x >>= 2) & 1) != b) return false;

            if (((y >>= 2) & 1) != c) return false;
        }

        return true;
    }
}
