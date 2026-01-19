class Solution {
    public String largestGoodInteger(String num) {
        int m = num.length();
        char maxDigit = '/';
        int maxA = -1, maxB = -1;

        for (int i = 0; i < m - 2; i++) {
            char c = num.charAt(i);

            if ((c == num.charAt(i + 1)) && (c == num.charAt(i + 2))) {
                if (c > maxDigit) {
                    maxDigit = c;
                    maxA = i;
                    maxB = i + 2;
                }
            }
        } 

        return (maxDigit == '/') ? "" : num.substring(maxA, maxB + 1);
    }
}
