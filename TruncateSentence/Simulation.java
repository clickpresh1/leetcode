class Solution {
    public String truncateSentence(String s, int k) {
        int m = s.length(), count = 0;

        for (int i = 0; i < m + 1; i++) {
            if ((i == m) || (s.charAt(i) == ' ')) {
                count++;
                
                if (count == k) return s.substring(0, i);
            }
        } 

        return s;
    }
}
