class Solution {
    public String sortString(String s) {
        int m = s.length();
        int[] freq = new int[26];
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()) freq[c - 'a']++;

        while (sb.length() < m) {
            for (int j = 0; j < 26; j++) {
                if (freq[j] > 0) {
                    char c = (char) ('a' + j);
                    sb.append(c);
                    freq[j]--;
                } 
            } 

            if (sb.length() == m) return sb.toString();

            for (int j = 25; j >= 0; j--) {
                if (freq[j] > 0) {
                    char c = (char) ('a' + j);
                    sb.append(c);
                    freq[j]--;
                }
            }
        } 

        return sb.toString();
    }
}
