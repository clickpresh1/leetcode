class Solution {
    public int bitwiseComplement(int n) {
        int b = (n & 1);
        b ^= 1;
        n >>= 1;

        int i = 1;
        while (n > 0) {
            int x = (n & 1);
            x ^= 1;
            x <<= i++;
            b = x | b;
            
            n >>= 1;
        } 

        return b;
    }
}
