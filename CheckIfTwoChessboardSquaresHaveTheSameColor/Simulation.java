class Solution {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        int char1a = coordinate1.charAt(0) - 'a' + 1;
        int char1b = coordinate1.charAt(1) - '0';

        int char2a = coordinate2.charAt(0) - 'a' + 1;
        int char2b = coordinate2.charAt(1) - '0';

        boolean ch1 = ((char1a + char1b) & 1) == 0;
        boolean ch2 = ((char2a + char2b) & 1) == 0;

        return ch1 == ch2;   
    }
}
