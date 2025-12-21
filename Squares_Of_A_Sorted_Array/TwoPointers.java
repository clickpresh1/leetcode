class Solution {
    public int[] sortedSquares(int[] nums) {
        int m = nums.length, x = 0, y = m - 1, i = m - 1;
        int[] arr = new int[m];

        while (i >= 0) {
            int a = nums[x] * nums[x], b = nums[y] * nums[y];

            if (a > b) {
                arr[i--] = a;
                x++;
            } else {
                arr[i--] = b;
                y--;
            }
        } 

        return arr;
    }
}
