class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        int m = sentence.length(), j = 0, indx = 1;
        
        for (int i = 0; i <= m; i++) {
            if ((i == m) || (sentence.charAt(i) == ' ')) {
                if (i > j) {
                    String s = sentence.substring(j, i);
                    if (s.startsWith(searchWord)) return indx;
                } 

                j = i + 1;

                indx++;
            }
        } 

        return -1;
    }
}
