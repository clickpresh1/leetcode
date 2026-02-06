class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        int m = edges.length;
        int[] roots = new int[n];

        for (int i = 0; i < n; i++) roots[i] = i;

        for (int i = 0; i < m; i++) {
            int a = edges[i][0], b = edges[i][1];

            int rootA = root(roots, a), rootB = root(roots, b);
            if (rootA != rootB) roots[rootA] = rootB;
        } 

        return root(roots, source) == root(roots, destination);
    } 

    public static int root(int[] roots, int x) {
        if (roots[x] == x) return x;

        return roots[x] = root(roots, roots[x]);
    }
}
