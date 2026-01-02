class Solution {
    public int getSum(int a, int b) {
        
        while (b != 0) {
            int k = a ^ b, q = a & b;
            a = k;
            b = q << 1;
        } 

        return a;
    }
}
