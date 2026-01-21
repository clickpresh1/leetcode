class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int m = str1.length(), n = str2.length();

        if (m >= n) {
            int l = n;
            while (l > 0) {
                boolean matches = true;
                int i = 0;
                while (i < m) {
                    int j = 0;
                    int k = l;
                    while (j < n) {
                        if (str2.regionMatches(j, str2, 0, k)) {
                            j += k;
                        } else {
                            j = 0;
                            k--;
                            if (k == 0) return "";
                        }
                    } 

                    if (j == n) l = k;

                    if (str1.regionMatches(i, str2, 0, l)) {
                        i += l;
                    } else {
                        matches = false;
                        break;
                    }
                } 

                if (i == m) return str1.substring(0, l);
                else if (!matches) l--;
            }
        } else {
            int l = m;
            while (l > 0) {
                boolean matches = true;
                int i = 0;
                while (i < n) {
                    int j = 0;
                    int k = l;
                    while (j < m) {
                        if (str1.regionMatches(j, str1, 0, k)) {
                            j += k;
                        } else {
                            j = 0;
                            k--;
                            if (k == 0) return "";
                        }
                    } 

                    if (j == m) l = k;

                    if (str2.regionMatches(i, str1, 0, l)) {
                        i += l;
                    } else {
                        matches = false;
                        break;
                    }
                } 

                if (i == n) return str2.substring(0, l);
                else if (!matches) l--;
            }
        } 

        return "";
    } 
}
