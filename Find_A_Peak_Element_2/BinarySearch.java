class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int m = mat.length, n = mat[0].length, a = 0, b = n - 1;

        if ((m == 1) && (n == 1)) return new int[2];

        while (a <= b) {
            int mid = a + ((b - a) / 2);

            int row = binCol(mat, mid);

            int currMx = mat[row][mid];

            if (mid == 0) {
                if (currMx > mat[row][mid + 1]) return new int[] {row, mid}; 
                a = mid + 1;
                
            } else if (mid == n - 1) {
                if (currMx > mat[row][mid - 1]) return new int[] {row, mid};
                b = mid - 1;
            } else {
                if ((currMx > mat[row][mid - 1]) && (currMx > mat[row][mid + 1])) return new int[] {row, mid};
                else if (currMx < mat[row][mid + 1]) a = mid + 1;
                else if (currMx < mat[row][mid - 1]) b = mid - 1;
            } 
        } 

        return new int[2];  
    } 

    public static int binCol(int[][] mat, int col) {
        int mxIndx = 0;

        for (int i = 0; i < mat.length; i++) {
            if (mat[i][col] > mat[mxIndx][col]) mxIndx = i;
        } 

        return mxIndx;
    }
}
