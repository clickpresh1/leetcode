class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int m = s1.length(), n = s2.length(), count = 0;
        char cs11 = '0', cs12 = '0', cs21 = '0', cs22 = '0';

        if (m != n) return false;

        boolean firstSeen = false;

        for (int i = 0; i < m; i++) {
            char c = s1.charAt(i), d = s2.charAt(i);
            if (c != d) {
                if (!firstSeen) {
                    cs11 = c; cs21 = d;

                    firstSeen = true;
                } else {
                    cs22 = d; cs12 = c;

                    if ((cs11 != cs22) || (cs21 != cs12)) return false;
                } 

                count++;
            }

            if (count > 2) return false;
        } 

        if ((firstSeen) && (cs22 == '0')) return false;

        return true;
    }
}
