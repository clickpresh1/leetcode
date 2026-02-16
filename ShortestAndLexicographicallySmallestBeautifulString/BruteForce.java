class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int m = s.length(), a = 0, b = 0, mn = Integer.MAX_VALUE;

        for (int i = 0; i < m; i++) {
            int locCnt = 0;
            for (int j = i; j < m; j++) {
                if (s.charAt(j) == '1') locCnt++;

                if (locCnt == k) {
                    int locDiff = j - i + 1;

                    if (locDiff < mn) {
                        mn = locDiff;
                        a = i;
                        b = j + 1;
                    } else if (locDiff == mn) {
                        String str1 = s.substring(i, j + 1);
                        String str2 = s.substring(a, b);

                        if (smaller(str1, str2)) {a = i; b = j + 1;}
                    }
                }
            }
        } 

        return s.substring(a, b);
    } 

    public static boolean smaller(String s, String t) {
        int m = s.length();

        if (s.equals(t)) return false;

        int x = -1;
        while (++x < m) {
            char c = s.charAt(x), d = t.charAt(x);
            if (c != d) {
                if (c < d) return true;
                else return false;
            } 
        } 

        return false;
    }
}
