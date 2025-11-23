class NumMatrix {
    private int[][] matrix;
    private int[][] RD;

    public NumMatrix(int[][] matrix) {
        this.matrix = matrix;

        RD = new int[matrix.length + 1][matrix[0].length + 1];
        for (int i = matrix.length - 1; i >= 0; i--) {
            RD[i][matrix[0].length] = 0;
            for (int j = matrix[i].length - 1; j >= 0; j--) {
                RD[i][j] = RD[i][j + 1] + matrix[i][j];
            } 
        }
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int[] D = new int[RD.length + 1];

        D[RD.length] = 0;
        for (int i = RD.length - 1; i >= 0; i--) {
            D[i] = D[i + 1] + (RD[i][col1] - RD[i][col2 + 1]);
        } 

        return D[row1] - D[row2 + 1];
    }
}

/**
 * Your NumMatrix object will be instantiated and called as such:
 * NumMatrix obj = new NumMatrix(matrix);
 * int param_1 = obj.sumRegion(row1,col1,row2,col2);
 */
