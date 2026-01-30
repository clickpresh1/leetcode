class Solution {
    public int deleteGreatestValue(int[][] grid) {
        int m = grid.length, n = grid[0].length, sum = 0;

        int numOfCols = n + 1;

        while (--numOfCols > 0) {
            sum += func(grid, numOfCols);
        } 

        return sum;
    } 

    public static int func(int[][] mat, int numOfCols) {
        int m = mat.length, n = numOfCols;

        int mx = -1;
        for (int i = 0; i < m; i++) {
            int locMx = -1, locMxIndx = -1;
            for (int j = 0; j < n; j++) {
                if (mat[i][j] > locMx) {
                    locMx = mat[i][j];
                    locMxIndx = j;
                }
            } 

            mat[i][locMxIndx] = -2;

            int temp = mat[i][locMxIndx];
            mat[i][locMxIndx] = mat[i][n - 1];
            mat[i][n - 1] = temp;

            if (locMx > mx) mx = locMx;
        } 

        return mx;
    }
}
