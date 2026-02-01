class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int m = grid.length, n = grid[0].length, mx = -1;
        int[] cols = new int[n];

        for (int j = 0; j < n; j++) {
            int locMx = -1;

            for (int i = 0; i < m; i++) {
                int l = length(grid[i][j]);
                if (l > locMx) locMx = l;
                
                if (locMx == 11) break;
            } 

            cols[j] = locMx;
        } 

        return cols;
    } 

    public static int length(int a) {
        if (a == Integer.MIN_VALUE) return 11;
        if (a == 0) return 1;

        int l = 0;
        if (a < 0) {l++; a = -a;}

        if (a < 10) return l + 1;
        else if (a < 100) return l + 2;
        else if (a < 1000) return l + 3;
        else if (a < 10000) return l + 4;
        else if (a < 100000) return l + 5;
        else if (a < 1000000) return l + 6;
        else if (a < 10000000) return l + 7;
        else if (a < 100000000) return l + 8;
        else if (a < 1000000000) return l + 9;
        else return l + 10;
    }
}
