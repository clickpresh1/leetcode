class Solution {
    public int[] findRightInterval(int[][] intervals) {
        int m = intervals.length;
        int[][] arr = new int[m][2];
        int[] res = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i][0] = intervals[i][0];
            arr[i][1] = i;
        } 

        Arrays.sort(arr, (x, y) -> {
            return Integer.compare(x[0], y[0]);
        }); 

        for (int i = 0; i < m; i++) {
            int f = intervals[arr[i][1]][1];
            int r = resIndx(intervals, arr, i, f);

            res[arr[i][1]] = r == -1 ? -1 : arr[r][1];
        }

        return res;
    } 

    public static int resIndx(int[][] intervals, int[][] arr, int k, int f) {
        int m = intervals.length;
        int x = k, y = m - 1;

        while (x <= y) {
            int mid = x + ((y - x) / 2);
            int g = arr[mid][0];

            if (g == f) return mid;
            else if (g > f) y = mid - 1;
            else x = mid + 1;
        } 

        return x == m ? -1 : x;
    }
}
