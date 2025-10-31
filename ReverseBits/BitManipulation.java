class Solution {
    public int reverseBits(int n) {
        int z = 0;
        int i = 0;
        while (i < 32) {
            int b = n & 1;
            z = (z << 1) | b;

            n >>>= 1;

            i += 1;
        } 

        return z;
    }
}
