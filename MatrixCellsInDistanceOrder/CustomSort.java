class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {
        int q = rows * cols;
        int[][] mat = new int[q][2];

        int k = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[k][0] = i;
                mat[k++][1] = j;
            }
        } 

        Arrays.sort(mat, (a, b) -> ((Math.abs(a[0] - rCenter) + Math.abs(a[1] - cCenter)) - (Math.abs(b[0] - rCenter) + Math.abs(b[1] - cCenter))));

        return mat;
    }
}
