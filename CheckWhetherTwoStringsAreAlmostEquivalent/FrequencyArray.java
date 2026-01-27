class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int m = word1.length();
        int[] freq1 = new int[26], freq2 = new int[26];

        for (int i = 0; i < m; i++) {
            int k = word1.charAt(i) - 'a', q = word2.charAt(i) - 'a';

            freq1[k]++; freq2[q]++;
        } 

        for (int i = 0; i < 26; i++) {
            int x = freq1[i] - freq2[i];

            if ((x > 3) || (x < -3)) return false;
        }

        return true;
    }
}
