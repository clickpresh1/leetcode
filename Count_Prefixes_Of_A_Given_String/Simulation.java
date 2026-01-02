class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;

        for (String t : words) if (s.startsWith(t)) count++;

        return count;
    }
}
