class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        Arrays.sort(arr2);
        int m = arr1.length, n = arr2.length, cnt = 0;

        for (int i = 0; i < m; i++) {
            int c = arr2[closest(arr2, arr1[i])];
            int z = Math.abs(arr1[i] - c);

            if (z > d) cnt++;
        } 

        return cnt;
    } 

    public static int closest(int[] a, int b) {
        int m = a.length, x = 0, y = m - 1;

        while (x <= y) {
            int mid = x + ((y - x) / 2);

            if (a[mid] == b) return mid;
            else if (a[mid] > b) y = mid - 1;
            else x = mid + 1;
        } 

        if (y < 0) return 0;
        if (x >= m) return y;

        return (b - a[y]) < (a[x] - b) ? y : x;
    }
}
