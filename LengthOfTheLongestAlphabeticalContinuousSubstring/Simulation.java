class Solution {
    public int longestContinuousSubstring(String s) {
        int mx = 1, locMx = 0;

        char prev = (char) ('a' - 1);
        for (char c : s.toCharArray()) {
            locMx = (c - prev != 1) ? 1 : ++locMx;

            if (locMx > mx) mx = locMx;

            prev = c;
        } 

        return mx;
    }
}
