class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int m = word1.length();
        int[] freq = new int[26];

        for (int i = 0; i < m; i++) {
            int k = word1.charAt(i) - 'a', q = word2.charAt(i) - 'a';

            freq[k]++; freq[q]--;
        } 

        for (int i = 0; i < 26; i++) {
            if ((freq[i] > 3) || (freq[i] < -3)) return false;
        }

        return true;
    }
}
