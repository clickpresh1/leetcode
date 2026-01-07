class Solution {
    public boolean checkValid(int[][] matrix) {
        int m = matrix.length;

        for (int i = 0; i < m; i++) {
            boolean[] r = new boolean[m + 1], c = new boolean[m + 1];

            for (int j = 0; j < m; j++) {
                if (r[matrix[i][j]]) return false;
                r[matrix[i][j]] = true;

                if (c[matrix[j][i]]) return false;
                c[matrix[j][i]] = true;
            }
        } 

        return true;
    }
}
