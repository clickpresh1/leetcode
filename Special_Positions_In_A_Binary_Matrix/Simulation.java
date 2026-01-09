class Solution {
    public int numSpecial(int[][] mat) {
        int m = mat.length, n = mat[0].length, k = 0;

        int[] r = new int[m], c = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 1) {
                    r[i]++; c[j]++;
                }
            }
        } 

        for (int i = 0; i < m; i++) {
            if (r[i] == 1) {
                for (int j = 0; j < n; j++) {
                    if (mat[i][j] == 1) {
                        if (c[j] == 1) k++;

                        break;
                    }
                }
            }
        } 

        return k;
    } 
}
