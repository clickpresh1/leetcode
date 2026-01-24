class Solution {
    public boolean areOccurrencesEqual(String s) {
        int m = s.length(), mx = -1, mn = 1001;
        int[] freq = new int[26];

        for (char c : s.toCharArray()) freq[c - 'a']++;

        int check = freq[s.charAt(0) - 'a'];

        for (int i = 0; i < 26; i++) {
            if (freq[i] != 0) {
                if (freq[i] != check) return false;
            }
        }

        return true;
    }
}
