class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length, n = mat[0].length, t = arr.length;
        int[] freq = new int[(m * n) + 1]; 

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                freq[mat[i][j]] = (i * n) + j;
            }
        } 

        int[] row = new int[m], col = new int[n];

        for (int i = 0; i < t; i++) {
            int q = freq[arr[i]], r = q / n, c = q % n;

            if (++row[r] == n) return i;

            if (++col[c] == m) return i;
        } 

        return --t;
    }
}
