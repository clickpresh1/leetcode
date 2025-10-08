class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int[][] pathsArr = new int[m][n];

        pathsArr[0][0] = grid[0][0];

        for (int i = 1; i < m; i++) {
            pathsArr[i][0] = grid[i][0] + pathsArr[i - 1][0];
        } 

        for (int j = 1; j < n; j++) {
            pathsArr[0][j] = grid[0][j] + pathsArr[0][j - 1];
        } 

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                pathsArr[i][j] = grid[i][j] + Math.min(pathsArr[i - 1][j], pathsArr[i][j - 1]);
            }
        } 

        return pathsArr[m - 1][n - 1];
    }
}
