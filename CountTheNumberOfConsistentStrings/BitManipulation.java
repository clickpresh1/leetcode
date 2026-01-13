class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int m = allowed.length(), n = words.length, b = 0, count = n;

        for (int i = 0; i < m; i++) {
            b |= 1 << (allowed.charAt(i) - 'a');
        } 

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                int d = 1 << (words[i].charAt(j) - 'a');
                if ((b & d) == 0) {
                    count--;
                    break;
                }
            }
        } 

        return count;
    }
}
