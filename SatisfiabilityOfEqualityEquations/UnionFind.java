class Solution {
    public boolean equationsPossible(String[] equations) {
        int m = equations.length;
        int[] roots = new int[26];

        for (int i = 0; i < 26; i++) roots[i] = i;

        for (int i = 0; i < m; i++) {
            if (equations[i].charAt(1) == '!') continue;

            char c = equations[i].charAt(0), d = equations[i].charAt(3);
            int a = c - 'a', b = d - 'a';
            int f = root(roots, a), g = root(roots, b);

            if (f != g) roots[f] = g;
        } 

        for (int i = 0; i < m; i++) {
            if (equations[i].charAt(1) == '=') continue;
            
            char c = equations[i].charAt(0), d = equations[i].charAt(3);
            int a = c - 'a', b = d - 'a';
            int f = root(roots, a), g = root(roots, b);

            if (f == g) return false;
        }

        return true;
    } 

    public static int root(int[] roots, int x) {
        if (roots[x] == x) return x;

        return roots[x] = root(roots, roots[x]);
    }
}
