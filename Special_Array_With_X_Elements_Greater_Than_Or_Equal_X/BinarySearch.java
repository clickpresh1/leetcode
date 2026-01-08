class Solution {
    public int specialArray(int[] nums) {
        int x = 1, y = nums.length;

        while (x <= y) {
            int mid = x + ((y - x) / 2);

            int q = count(nums, mid);

            if (q == mid) return mid;
            else if (q > mid) x = mid + 1;
            else y = mid - 1;
        } 

        return -1;
    } 

    public static int count(int[] arr, int b) {
        int count = 0;

        for (int item : arr) if (item >= b) count++;

        return count;
    }
}
