class Solution {
    public int minBitFlips(int start, int goal) {
        int x = start ^ goal;
        
        int z = 0;
        while (x != 0) {
            if ((x & 1) == 1) z += 1;

            x >>= 1;
        }
        
        return z;
    }
}
