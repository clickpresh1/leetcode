class Solution {
    public int possibleStringCount(String word) {
        int m = word.length(), x = 1;

        for (int i = 1; i < m; i++) {
            if (word.charAt(i) == word.charAt(i - 1)) x++;
        } 

        return x;
    }
}
