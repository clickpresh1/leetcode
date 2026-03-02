class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int m = grid.length, n = grid[0].length, p = m * n, M = 12345;
        int[] prod = new int[p];
        int[][] G = new int[m][n];

        int preProd = 1, k = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                prod[k++] = preProd;
                preProd = (preProd * (grid[i][j] % M)) % M;
            }
        } 

        k--;
        int suffProd = 1, x = m - 1, y = n - 1;
        for (int i = p - 1; i >= 0; i--) {
            G[x][y] = (prod[i] * suffProd) % M;
            suffProd = (suffProd * (grid[x][y] % M)) % M;

            if (--y < 0) {y = n - 1; x--;}
        } 

        return G;
    }
}
