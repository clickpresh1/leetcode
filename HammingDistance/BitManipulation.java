class Solution {
    public int hammingDistance(int x, int y) {
        int a = x ^ y;
        int z = 0;

        while (a > 0) {
            if ((a & 1) == 1) z += 1;

            a >>= 1;
        } 

        return z;
    }
}
