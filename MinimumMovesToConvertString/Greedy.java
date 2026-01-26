class Solution {
    public int minimumMoves(String s) {
        int m = s.length(), moves = 0;
        char[] arr = s.toCharArray();

        int i = 0;
        while (i < m) {
            if (arr[i] == 'X') {moves++; i += 3;}
            else i++;
        } 

        return moves;
    } 
}
