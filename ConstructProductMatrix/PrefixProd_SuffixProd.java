class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int m = grid.length, n = grid[0].length, p = m * n, k = 0;
        int[] arr = new int[p];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) arr[k++] = grid[i][j] % 12345;
        } 

        int[] pref = new int[p], suff = new int[p];

        pref[0] = arr[0];
        for (int i = 1; i < p; i++) {
            pref[i] = (arr[i] * pref[i - 1]) % 12345;
        } 

        suff[p - 1] = arr[p - 1];
        for (int i = p - 2; i >= 0; i--) {
            suff[i] = (arr[i] * suff[i + 1]) % 12345;
        } 

        int[] prod = new int[p];

        for (int i = 0; i < p; i++) {
            if (i == 0) prod[0] = suff[1];
            else if (i == p - 1) prod[p - 1] = pref[p - 2];
            else prod[i] = (pref[i - 1] * suff[i + 1]) % 12345;
        } 

        for (int i = 0; i < p; i++) grid[i / n][i % n] = prod[i];

        return grid;
    }
}
