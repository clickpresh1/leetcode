class Solution {
    public int[] shortestToChar(String s, char c) {
        char[] arr = s.toCharArray();
        int m = arr.length;
        int[] res = new int[m];
        
        for (int i = 0; i < m; i++) {
            if (arr[i] == c) res[i] = 0;
            else res[i] = check(arr, i, c);
        } 

        return res;
    } 

    public static int check(char[] a, int b, char c) {
        
        int m = a.length, x = b - 1, y = b + 1;
        
        if (b == 0) x = 0;
        if (b == m - 1) y = m - 1;
        while ((x >= 0) && (y < m)) {
            if (a[y] == c) return y - b;
            if (a[x] == c) return b - x;

            if (x > 0) x--;
            if (y < m - 1) y++; 
        } 

        return -1;
    }
}
