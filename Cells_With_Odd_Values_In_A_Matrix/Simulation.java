class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int x = indices.length, count = 0;;
        int[][] mat = new int[m][n];

        for (int i = 0; i < x; i++) {
            op(mat, indices[i][0], indices[i][1]);
        } 

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if ((mat[i][j] % 2) != 0) count++;
            }
        } 

        return count;
    } 

    public static void op(int[][] c, int a, int b) {
        int m = c.length, n = c[0].length;

        for (int i = 0; i < n; i++) {
            c[a][i]++;
        } 

        for (int i = 0; i < m; i++) {
            c[i][b]++;
        }
    }
}
