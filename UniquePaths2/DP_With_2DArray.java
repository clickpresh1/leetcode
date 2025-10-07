class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        if (obstacleGrid[0][0] == 1) return 0;

        int[][] pathsArr = new int[m][n];

        pathsArr[0][0] = 1;

        for (int i = 1; i < m; i++) {
            if (obstacleGrid[i][0] == 0) {
                if (pathsArr[i - 1][0] == 1) {
                    pathsArr[i][0] = 1;
                }
            }
        } 

        for (int j = 1; j < n; j++) {
            if (obstacleGrid[0][j] == 0) {
                if (pathsArr[0][j - 1] == 1) {
                    pathsArr[0][j] = 1;
                }
            }
        } 

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrid[i][j] == 0) {
                    pathsArr[i][j] = pathsArr[i - 1][j] + pathsArr[i][j - 1];
                }
            }
        } 

        return pathsArr[m - 1][n - 1];        
    }
}
