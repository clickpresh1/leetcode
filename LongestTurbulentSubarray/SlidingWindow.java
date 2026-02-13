class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int m = arr.length, len = 0, i = 0;

        while (i < m - 1) {
            int u = i, locLen = 0;
            
            if (arr[u] > arr[u + 1]) {
                int mod = u % 2;
                while (u < m - 1) {
                    if (u % 2 == mod) {
                        if (arr[u] > arr[u + 1]) locLen++;
                        else break;
                    } else {
                        if (arr[u] < arr[u + 1]) locLen++;
                        else break;
                    } 

                    u++;
                } 

            } else if (arr[u] < arr[u + 1]) {
                int mod = u % 2;
                while (u < m - 1) {
                    if (u % 2 == mod) {
                        if (arr[u] < arr[u + 1]) locLen++;
                        else break;
                    } else {
                        if (arr[u] > arr[u + 1]) locLen++;
                        else break;
                    } 

                    u++;
                } 
            } 

            if (locLen > len) len = locLen;

            i = (i == u) ? u + 1 : u;
        } 

        return ++len;
    }
}
