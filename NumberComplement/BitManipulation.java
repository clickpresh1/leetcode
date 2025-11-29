class Solution {
    public int findComplement(int num) {
        int b = (num & 1) ^ 1, c = b;
        num >>= 1;

        int i = 1;
        while (num != 0) {
            b = (num & 1) ^ 1;
            b <<= i;
            c = b | c;
            num >>= 1;
            i += 1;
        } 

        return c;
    }
}
