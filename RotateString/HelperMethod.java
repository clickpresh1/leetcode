class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;

        int m = s.length(), k = 0;

        while (k < m) {
            String str = rotate(s);
            if (str.equals(goal)) return true;
            s = str;

            k++;
        } 

        return false;
    } 

    public static String rotate(String str) {
        char[] strArr = str.toCharArray();
        int m = strArr.length;

        char tempf = strArr[0];
        for (int i = m - 1; i >= 0; i--) {
            char tempc = strArr[i];
            strArr[i] = tempf;
            tempf = tempc;

        }

        return new String(strArr);
    }
}
