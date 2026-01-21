class Solution {
    public boolean makeEqual(String[] words) {
        int m = words.length;
        int[] freq = new int[26];

        for (String s : words) {
            for (char c : s.toCharArray()) freq[c - 'a']++;
        } 

        for (int i = 0; i < 26; i++) {
            if (freq[i] % m != 0) return false;
        } 

        return true;
    }
}
