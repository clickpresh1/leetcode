class Solution {
    public int findKthLargest(int[] nums, int k) {
        int m = nums.length;

        int x = 0, y = m - 1;

        while (x <= y) {
            int pivotIndx = partition(nums, x, y);

            if (pivotIndx == (m - k)) return nums[pivotIndx];
            else if (pivotIndx < (m - k)) x = pivotIndx + 1;
            else y = pivotIndx - 1;
        } 

        return -1;
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
