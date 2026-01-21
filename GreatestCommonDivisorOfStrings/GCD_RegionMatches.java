class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int m = str1.length(), n = str2.length();

        if (m == n) {
            if (str1.equals(str2)) return str1;
            else return "";
        } 

        int gcd = 0;
        int a = m, b = n;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        } 

        gcd = a;

        String res = str1.substring(0, gcd);

        int i = 0;
        while (i < m) {
            if (str1.regionMatches(i, res, 0, gcd)) i += gcd;
            else return "";
        } 

        int j = 0;
        while (j < n) {
            if (str2.regionMatches(j, res, 0, gcd)) j += gcd;
            else return "";
        } 

        return res;
    } 
}
