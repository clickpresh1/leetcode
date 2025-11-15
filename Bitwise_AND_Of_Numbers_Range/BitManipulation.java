class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        if (left == right) return (left & right);

        if ((right & (right - 1)) == 0) return 0;

        int L = left;
        int R = right;

        int x = 0;
        while (L != R) {
            L >>= 1;
            R >>= 1;

            x += 1;
        } 

        return L << x;
    }
}
