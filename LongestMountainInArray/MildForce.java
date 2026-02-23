class Solution {
    public int longestMountain(int[] arr) {
        int m = arr.length, mx = 0;

        for (int i = 0; i < m; i++) {
            int len = mount(arr, i);

            if (len > mx) mx = len;
        } 

        return mx;
    } 

    public static int mount(int[] arr, int b) {
        int m = arr.length;

        int x = b;
        while ((--x >= 0) && (arr[x] < arr[x + 1])) {}

        if (b - x - 1 == 0) return -1;

        int y = b;
        while ((++y < m) && (arr[y] < arr[y - 1])) {}

        if (y - b - 1 == 0) return -1;

        return y - x - 1;
    }
}
