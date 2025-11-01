class Solution {
    public int hammingWeight(int n) {
        int z = 0;

        while (n > 0) {
            if ((n & 1) == 1) z += 1;

            n >>= 1;
        } 

        return z;
    }
}
