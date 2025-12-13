class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;

        for (int i = 0; i < m - 1; i++) {
            int x = matrix[i][0];

            int p = i + 1, q = 1;
            while ((p < m) && (q < n)) {
                if (matrix[p][q] != x) return false;

                p++;
                q++;
            }
        } 

        for (int j = 0; j < n - 1; j++) {
            int x = matrix[0][j];

            int p = 1, q = j + 1;
            while ((p < m) && (q < n)) {
                if (matrix[p][q] != x) return false;

                p++;
                q++;
            }
        }

        return true;
    }
}
