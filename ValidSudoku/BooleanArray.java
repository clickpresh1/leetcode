class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean[] r = new boolean[10], c = new boolean[10];

            for (int j = 0; j < 9; j++) {
                char ch = board[i][j];
                if (ch != '.') {
                    int val1 = ch - '0';
                    if (r[val1]) return false;
                    r[val1] = true;
                }
                
                ch = board[j][i];
                if (ch != '.') {
                    int val2 = ch - '0';
                    if (c[val2]) return false;
                    c[val2] = true;
                }
            } 

            int row = (i / 3) * 3, col = (i % 3) * 3;

            boolean[] seen = new boolean[10];
            for (int a = row; a < (row + 3); a++) {
                for (int b = col; b < (col + 3); b++) {
                    char ch = board[a][b];
                    if (ch != '.') {
                        int valS = ch - '0';
                        if (seen[valS]) return false;
                        seen[valS] = true;
                    }
                }
            } 
        } 

        return true;
    }
} 
