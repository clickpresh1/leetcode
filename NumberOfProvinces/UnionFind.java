class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length, cnt = n;
        int[] roots = new int[n + 1];

        for (int i = 1; i < n + 1; i++) roots[i] = i;

        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j < n + 1; j++) {
                if (isConnected[i - 1][j - 1] == 1) {
                    int f = root(roots, i), g = root(roots, j);

                    if (f != g) {
                        roots[f] = g;
                        cnt--;
                    }
                }
            } 
        } 

        return cnt;
    } 

    public static int root(int[] roots, int x) {
        if (roots[x] == x) return x;

        return roots[x] = root(roots, roots[x]);
    }
}
