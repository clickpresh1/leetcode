class Solution {
    public int minimumOperations(int[][] grid) {
        int m = grid.length, n = grid[0].length, count = 0;

        for (int j = 0; j < n; j++) {
            int first = grid[0][j] + 1;

            for (int i = 1; i < m; i++) {
                if (grid[i][j] < first) {
                    count += first - grid[i][j];
                    grid[i][j] = first;
                }

                first = grid[i][j] + 1;
            } 
        } 

        return count;
    }
}
