class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[] r1 = new int[m], c1 = new int[n];

        int[][] diff = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    r1[i]++; c1[j]++;
                }
            }
        } 

        for (int i = 0; i < m; i++) {
            // k ought to be r1[i] + c1[j] - (n - r1[i]) - (m - c1[j]);
            // but we will compute without the c1 value for now
            int k = (2 * r1[i]) - (m + n);
            for (int j = 0; j < n; j++) {
                diff[i][j] = k + (2 * c1[j]);
            }
        } 

        return diff;
    }
}
