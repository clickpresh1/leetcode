class Solution {
    public int reverseBits(int n) {
        StringBuilder sb = new StringBuilder();

        int rem = n % 2;
        n /= 2;
        sb.append(rem);

        while (n > 0) {
            rem = n % 2;
            sb.append(rem);

            n /= 2;
        } 

        rem = n % 2;
        sb.append(rem);

        int x = 32 - sb.length();
        String s = "0".repeat(x);
        sb.append(s);
        
        return Integer.parseInt(sb.toString(), 2);
    }
}
