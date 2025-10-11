class Solution {
    public static String countAndSay(int n) {
        String s = "1";
        for (int i = 1; i < n; i++) {
            s = helper(s);
        } 

        return s;
    } 

    public static String helper(String a) {
        StringBuilder sb = new StringBuilder();
        int m = a.length();
        int L = 0;

        while (L < m) {
            int x = a.charAt(L) - '0';
            int count = 0;

            while ((L < m) && ((a.charAt(L) - '0') == x)) {
                count += 1;
                L += 1;
            } 

            sb.append(count);
            sb.append(x);
        } 
        
        return sb.toString();
    } 
}
