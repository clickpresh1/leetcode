class Solution {
    public boolean winnerOfGame(String colors) {
        int m = colors.length(), movesA = 0, movesB = 0, i = 0;
        char[] arr = colors.toCharArray();

        while (i < m) {
            char c = arr[i];
            int j = i + 1;

            while ((j < m) && (arr[j] == c)) j++;

            if (j - i >= 3) {
                int move = (j - i) - 2;
                if (c == 'A') movesA += move;
                else movesB += move;
            } 

            i = j;
        } 

        return (movesA > movesB) ? true : false;
    }
}
