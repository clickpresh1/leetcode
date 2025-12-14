class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        
        char[] sArr = s.toCharArray(), goalArr = goal.toCharArray();
        int m = sArr.length, k = 0;

        while (k < m) {
            rotate(sArr);

            if (check(sArr, goalArr)) return true;

            k++;
        } 

        return false;
    } 

    public static void rotate(char[] a) {
        char tempForward = a[0];
        
        for (int i = a.length - 1; i >= 0; i--) {
            char tempCurr = a[i];
            a[i] = tempForward;
            tempForward = tempCurr;
        }
    } 

    public static boolean check(char[] a, char[] b) {
        for (int i = 0; i < a.length; i++) if (a[i] != b[i]) return false;

        return true;
    }
}
