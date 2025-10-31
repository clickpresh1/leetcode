class Solution {
    public int reverseBits(int n) {
        if (n == 0) return 0;
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            int b = n & 1;
            sb.append(b);
            n >>= 1;
        } 

        int x = 32 - sb.length();
        String s = "0".repeat(x);
        sb.append(s);
        
        return Integer.parseInt(sb.toString(), 2);
    }
}
