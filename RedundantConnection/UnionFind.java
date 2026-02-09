class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int m = edges.length;
        int[] roots = new int[m + 1];

        for (int i = 1; i < m + 1; i++) roots[i] = i; 

        for (int i = 0; i < m; i++) {
            int a = edges[i][0], b = edges[i][1];
            int f = root(roots, a), g = root(roots, b);

            if (f != g) roots[f] = g;
            else return edges[i];
        } 

        return new int[] {};
    } 

    public static int root(int[] roots, int x) {
        if (roots[x] == x) return x;

        return roots[x] = root(roots, roots[x]);
    }
}
