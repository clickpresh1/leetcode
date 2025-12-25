class Solution {
    public void duplicateZeros(int[] arr) {
        int m = arr.length, j = 0;

        while (j < m) {
            if (arr[j] == 0) {
                shift(arr, j);
                j++;
            } 

            j++;

            if (j == m) break;
        }
    } 

    public static void shift(int[] a, int b) {
        int m = a.length;
        for (int i = m - 1; i > b + 1; i--) a[i] = a[i - 1];

        if (b < m - 1) a[b + 1] = 0;
    }
}
