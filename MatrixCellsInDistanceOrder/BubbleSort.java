class Solution {
    public int[][] allCellsDistOrder(int rows, int cols, int rCenter, int cCenter) {

        int q = rows * cols;
        int[][] mat = new int[q][2];
        int[] indx = new int[q];

        int k = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[k] = new int[] {i, j};
                int x = Math.abs(i - rCenter) + Math.abs(j - cCenter);
                indx[k] = x;
                k++;
            }
        } 

        for (int j = 0; j < q; j++) {
            for (int i = 0; i < q - 1; i++) {
                if (indx[i] > indx[i + 1]) {
                    int[] temp = mat[i];
                    mat[i] = mat[i + 1];
                    mat[i + 1] = temp;

                    int temp2 = indx[i];
                    indx[i] = indx[i + 1];
                    indx[i + 1] = temp2;
                }
            }
        } 

        return mat;
    }
}
