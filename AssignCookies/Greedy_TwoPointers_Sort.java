class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int x = 0, y = 0;
        Arrays.sort(g);
        Arrays.sort(s);

        while ((x < g.length) && (y < s.length)) {
            if (s[y] >= g[x]) {
                x += 1;
            }
            
            y += 1;
        }

        return x;
    }
}
