class Solution {
    public boolean checkValid(int[][] matrix) {
        int m = matrix.length;

        for (int i = 0; i < m; i++) {
            int[] freqRow = new int[m + 1], freqC = new int[m + 1];

            for (int j = 0; j < m; j++) {
                freqRow[matrix[i][j]]++;
                if (freqRow[matrix[i][j]] > 1) return false;

                freqC[matrix[j][i]]++;
                if (freqC[matrix[j][i]] > 1) return false;
            }
        } 

        return true;
    }
}
