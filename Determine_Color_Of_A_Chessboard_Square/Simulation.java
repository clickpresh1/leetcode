class Solution {
    public boolean squareIsWhite(String coordinates) {
        int char1 = coordinates.charAt(0) - 'a' + 1;
        int char2 = coordinates.charAt(1) - '0';

        return (((char1 + char2) & 1) == 0) ? false : true;
    }
}
