class Solution {
    public boolean checkIfPangram(String sentence) {
        int m = sentence.length();

        if (m < 26) return false;

        int bitAlphabet = (1 << 26) - 1;
        int bitSentence = 0;

        for (int i = 0; i < m; i++) {
            bitSentence |= (1 << (sentence.charAt(i) - 'a'));

            if (bitAlphabet == bitSentence) return true;
        } 

        return false;
    }
}
