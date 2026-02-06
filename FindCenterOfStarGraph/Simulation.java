class Solution {
    public int findCenter(int[][] edges) {
        int a = edges[0][0], b = edges[0][1];
        int x = edges[1][0], y = edges[1][1];

        return ((a == x) || (a == y)) ? a : b;
    }
}
