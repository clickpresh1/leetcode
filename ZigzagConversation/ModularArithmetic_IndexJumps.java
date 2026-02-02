class Solution {
    public String convert(String s, int numRows) {
        int m = s.length();

        if ((m == 1) || (numRows == 1)) return s;

        char[] arr = s.toCharArray(), res = new char[m];

        int f = numRows + (numRows - 2);

        int x = 0, y = f, j = 0;

        while (x < m) {
            res[j++] = arr[x];

            x += f;
        } 

        x = 1; y = f - 1;

        while (x < y) {
            int u = x, v = y;
            while ((u < m) && (v < m)) {
                res[j++] = arr[u]; res[j++] = arr[v];

                u += f; v += f;
            } 

            if (u < m) res[j++] = arr[u];

            x++; y--;
        } 

        while (x < m) {
            res[j++] = arr[x];

            x += f;
        }

        return new String(res);
    }
}
