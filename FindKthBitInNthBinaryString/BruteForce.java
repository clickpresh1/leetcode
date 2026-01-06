class Solution {
    public char findKthBit(int n, int k) {
        StringBuilder sb = new StringBuilder("0");

        while (sb.length() < k) next(sb);

        return sb.charAt(k - 1);
    } 

    public static void next(StringBuilder sb) {
        int m = sb.length();

        sb.append('1');

        for (int i = m - 1; i >= 0; i--) {
            char c = (sb.charAt(i) == '0') ? '1' : '0';

            sb.append(c);
        } 
    } 
}
