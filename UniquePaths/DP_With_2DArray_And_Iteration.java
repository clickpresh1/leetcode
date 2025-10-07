class Solution {
    public int uniquePaths(int m, int n) {
        int[][] pathsArr = new int[m][n];
        pathsArr[0][0] = 1;

        for (int i = 1; i < m; i++) {
            pathsArr[i][0] = 1;
        } 

        for (int j = 1; j < n; j++) {
            pathsArr[0][j] = 1;
        } 

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                pathsArr[i][j] = pathsArr[i - 1][j] + pathsArr[i][j - 1];
            }
        } 

        return pathsArr[m - 1][n - 1]; 
    }
}
