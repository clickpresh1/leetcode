class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length, n = mat[0].length;
        int[][] arr = new int[m][2];
        int[] res = new int[k];

        for (int i = 0; i < m; i++) {
            arr[i][0] = i;
            arr[i][1] = soldiers(mat[i]);
        } 

        for (int i = 0, x = 0; i < k; i++) {
            for (int j = 0; j < m - 1 - i; j++) {
                if ((arr[j][1] < arr[j + 1][1]) || ((arr[j][1] == arr[j + 1][1])) && (arr[j][0] < arr[j + 1][0])) {
                    int[] temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                } 
            } 

            res[x++] = arr[m - 1 - i][0];
        } 

        return res;
    } 

    public static int soldiers(int[] a) {
        int n = a.length, x = 0, y = n - 1;
        while (x <= y) {
            int mid = x + ((y - x) / 2);
            if (a[mid] == 1) x = mid + 1;
            else y = mid - 1;
        } 

        return x;
    } 
}
