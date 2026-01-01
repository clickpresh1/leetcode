class Solution {
    public int countNegatives(int[][] grid) {
        int sum = 0, m = grid.length;

        for (int[] row : grid) sum += indx(row);

        return sum;
    } 

    public static int indx(int[] a) {
        int m = a.length, x = 0, y = m - 1;

        while (x <= y) {
            int mid = x + ((y - x) / 2);

            if (a[mid] >= 0) x = mid + 1;
            else y = mid - 1;
        } 

        return m - x;
    }
}
