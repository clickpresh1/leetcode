class Solution {
    public boolean detectCapitalUse(String word) {
        int count = 0, m = word.length();

        for (int i = 0; i < m; i++) { 
            if (Character.isUpperCase(word.charAt(i))) count++; 
        }

        if ((count == m) || (count == 0) || ((count == 1) && (Character.isUpperCase(word.charAt(0))))) return true;
        else return false;
    } 
}
