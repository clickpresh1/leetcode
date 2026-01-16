class Solution {
    public String longestNiceSubstring(String s) {
        int m = s.length(), maxLen = -1, maxIdxA = 101, maxIdxB = -1;

        for (int i = 0; i < m; i++) {
            int bitLower = 0;
            int bitUpper = 0;
            for (int j = i; j < m; j++) {
                char c = s.charAt(j);
                if (c >= 'a') bitLower |= (1 << (c - 'a'));
                else bitUpper |= (1 << (c - 'A'));

                if (bitLower == bitUpper) {
                    int currLen = j - i + 1;
                    if (currLen > maxLen) {
                        maxLen = currLen;
                        maxIdxA = i;
                        maxIdxB = j;    
                    }
                }
            }
        } 

        return (maxLen != -1) ? s.substring(maxIdxA, maxIdxB + 1) : "";
    }
}
