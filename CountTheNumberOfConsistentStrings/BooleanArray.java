class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int m = allowed.length(), n = words.length;
        boolean[] boos = new boolean[26];

        for (int i = 0; i < m; i++) {
            boos[allowed.charAt(i) - 'a'] = true;
        } 

        for (String s : words) {
            for (char c : s.toCharArray()) {
                if (!boos[c - 'a']) {
                    n--;
                    break;
                }
            } 
        } 

        return n;
    }
}
