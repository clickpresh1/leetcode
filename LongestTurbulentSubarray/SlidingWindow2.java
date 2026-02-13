class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int m = arr.length, len = 0;
        char[] res = new char[m];
        res[0] = 'a';
        for (int i = 1; i < m; i++) {
            if (arr[i] > arr[i - 1]) res[i] = '1';
            else if (arr[i] < arr[i - 1]) res[i] = '0';
            else res[i] = 'a';
        } 

        int u = 1;
        while (u < m) {
            if (res[u] != 'a') {
                int v = u, locLen = 0;
                char flip = res[v];
                while ((v < m) && (res[v] == flip)) {
                    v++;
                    flip ^= 1;
                    locLen++;
                } 

                if (locLen > len) len = locLen;

                u = --v;
            } 

            u++;
        } 

        return ++len;
    }
}
