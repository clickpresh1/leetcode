class Solution {
    public int countGoodSubstrings(String s) {
        int m = s.length(), count = 0;

        for (int i = 0; i < m - 2; i++) {
            char c = s.charAt(i), d = s.charAt(i + 1), e = s.charAt(i + 2); 
            if ((c != d) && (c != e) && (d != e)) count++;
        } 

        return count;
    }
}
