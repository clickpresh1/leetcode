class Solution {
    public double trimMean(int[] arr) {
        int m = arr.length, small = (int) (m * 0.05), large = m - small, sum = 0;

        quickSelect(arr, 0, m - 1, small);
        quickSelect(arr, small, m - 1, m - small);

        for (int i = small; i < large; i++) sum += arr[i];

        return (sum * 1.0) / (m - small - small);
    } 

    public static void quickSelect(int[] a, int x, int y, int q) {
        while (x <= y) {
            int p = partition(a, x, y);

            if (p == q) return;
            else if (p < q) x = p + 1;
            else y = p - 1;
        }
    }

    public static int partition(int[] a, int x, int y) {
        int mid = x + ((y - x) / 2);
        swap(a, mid, y);
        int pivotValue = a[y];
        int indx = x;

        for (int i = x; i < y; i++) {
            if (a[i] < pivotValue) {
                swap(a, i, indx);
                indx++;
            }
        } 

        swap(a, indx, y);

        return indx;
    } 

    public static void swap(int[] a, int x, int y) {
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }
}
