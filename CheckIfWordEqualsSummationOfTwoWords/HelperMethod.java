class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {
        
        return (cnv(firstWord) + cnv(secondWord) == cnv(targetWord));
    } 

    public static int cnv(String s) {
        int res = 0;

        for (char c : s.toCharArray()) {
            res = (res * 10) + (c - 'a');
        } 

        return res;
    }
}
