class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (!(Character.isDigit(board[i][j]))) continue;
                
                for (int k = 0; k < 9; k++) {
                    if ((j != k) && (board[i][j] == board[i][k])) return false;
                } 

                for (int q = 0; q < 9; q++) {
                    if ((i != q) && (board[i][j] == board[q][j])) return false;
                } 

                int x = ((i / 3) * 3);
                int y = ((j / 3) * 3);
                for (int r = x; r < (x + 3); r++) {
                    for (int s = y; s < (y + 3); s++) {
                        if ((i != r && j != s) && (board[i][j] == board[r][s])) {
                            return false;
                        }
                    }
                }
            }
        } 

        return true;
    }
} 
