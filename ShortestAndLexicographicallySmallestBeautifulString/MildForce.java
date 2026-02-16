class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int m = s.length(), a = 0, b = 0, mn = Integer.MAX_VALUE;
        char[] arr = s.toCharArray();

        for (int i = 0; i < m; i++) {
            int locCnt = 0;
            for (int j = i; j < m; j++) {
                int locLen = j - i + 1;

                if (locLen > mn) break;

                if (arr[j] == '1') locCnt++;

                if (locCnt == k) {
                    if (locLen < mn) {
                        mn = locLen;
                        a = i;
                        b = j + 1;
                    } else if (locLen == mn) {
                        int x = - 1;
                        while (++x < locLen) {
                            char c = arr[i + x], d = arr[a + x]; 

                            if (c != d) {
                                if (c < d) {
                                    a = i; b = j + 1;
                                } 

                                break;
                            }
                        }
                    } 

                    break;
                }
            }
        } 

        return s.substring(a, b);
    } 
}
