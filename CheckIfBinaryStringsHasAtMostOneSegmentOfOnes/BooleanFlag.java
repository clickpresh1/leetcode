class Solution {
    public boolean checkOnesSegment(String s) {
        int m = s.length();
        boolean seenZero = false;

        for (int i = 0; i < m; i++) {
            if (!seenZero) {
                if (s.charAt(i) == '0') seenZero = true;
            } else {
                if (s.charAt(i) == '1') return false;
            }
        } 

        return true;
    }
}
