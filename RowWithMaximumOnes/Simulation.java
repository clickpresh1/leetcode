class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int m = mat.length, n = mat[0].length, mx = -1, indx = -1;

        for (int i = 0; i < m; i++) {
            int locCount = 0;
            for (int j = 0; j < n; j++) {
                locCount += mat[i][j];

                if (locCount == n) return new int[] {i, n};
            } 

            if (locCount > mx) {
                mx = locCount;
                indx = i;
            } 
        } 

        return new int[] {indx, mx};
    }
}
