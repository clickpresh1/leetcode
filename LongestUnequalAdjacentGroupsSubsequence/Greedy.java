class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        int m = words.length;
        List<String> list = new ArrayList<>();

        int i = 0;
        list.add(words[i]);
        int bit = groups[i] ^ 1;
        while (++i < m) {
            if (groups[i] == bit) {
                bit ^= 1;
                list.add(words[i]);
            } 
        }

        return list;
    }
}
