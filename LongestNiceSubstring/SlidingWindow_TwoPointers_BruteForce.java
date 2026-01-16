class Solution {
    public String longestNiceSubstring(String s) {
        int m = s.length(), i = 0, max = -1, maxA = -1, maxB = 101;

        int[] f = new int[26];

        for (int g = 0; g < m; g++) {
            char c = s.charAt(g);

            if ((c - 'a') >= 0) {
                if (f[c - 'a'] == 0) f[c - 'a'] = 1;
                else if (f[c - 'a'] == 2) f[c - 'a'] = 3;
                else if ((f[c - 'a'] == 1) || (f[c - 'a'] == 3)) continue;
            }
            else {
                if (f[c - 'A'] == 0) f[c - 'A'] =2;
                else if (f[c - 'A'] == 1) f[c - 'A'] = 3;
                else if ((f[c - 'A'] == 2) || (f[c - 'A'] == 3)) continue;
            }
        } 

        while (i < m - 1) {
            int ch = (s.charAt(i) - 'a' >= 0) ? (s.charAt(i) - 'a') : (s.charAt(i) - 'A');
            if (f[ch] != 3) {
                i++;
                continue;
            }

            int j = i, k = j + 1;

            while (k < m) {
                int dh = (s.charAt(i) - 'a' >= 0) ? (s.charAt(i) - 'a') : (s.charAt(i) - 'A'); 

                if (f[dh] != 3) {
                    i++;
                    break;
                } 

                if (notNice(s, j, k)) {
                    k++;
                    continue;
                } else {
                    if (checkNice(s, j, k)) {
                        int currLen = k - j + 1;
                        if (currLen > max) {
                            max = currLen;
                            maxA = j;
                            maxB = k;
                        }
                    } 
                }

                k++;
            } 

            i++;
        } 

        return (max == -1) ? "" : s.substring(maxA, maxB + 1);
    } 

    public static boolean checkNice(String s, int a, int b) {
        int[] freq1 = new int[26], freq2 = new int[26];

        for (int i = a; i < b + 1; i++) {
            char c = s.charAt(i);
            if ((c - 'a') >= 0) freq1[c - 'a']++;
            else freq2[c - 'A']++;
        } 

        for (int i = a; i < b + 1; i++) {
            char c = s.charAt(i);
            if ((c - 'a') >= 0) {
                if (freq2[c - 'a'] == 0) return false;
            } else {
                if (freq1[c - 'A'] == 0) return false;
            }
        } 

        return true;
    } 

    public static boolean notNice(String s, int a, int b) {
        char c = (char) (s.charAt(b) ^ 32);

        for (int i = a; i < b; i++) {
            if (c == s.charAt(i)) return false;
        } 

        return true;
    }
}
