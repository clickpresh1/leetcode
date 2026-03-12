class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        if (value(event1[0], event2[0])) {
            String[] temp = event1;
            event1 = event2;
            event2 = temp;
        }

        return value(event1[1], event2[0]);
    } 

    public static boolean value(String s, String t) {
        char[] a = s.toCharArray(), b = t.toCharArray();

        if (a[0] > b[0]) return true;
        else if (a[0] < b[0]) return false;
        else {
            if (a[1] > b[1]) return true;
            else if (a[1] < b[1]) return false;
            else {
                if (a[3] > b[3]) return true;
                else if (a[3] < b[3]) return false;
                else {
                    if (a[4] >= b[4]) return true;
                    else return false;
                }
            }
        }
    }
}
