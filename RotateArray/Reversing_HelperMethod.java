class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;

        if (k != 0) {
            rotate(nums, 0, nums.length - 1);

            rotate(nums, 0, k - 1);

            rotate(nums, k, nums.length - 1);
        }
    } 

    public static void rotate(int[] nums, int a, int b) {
        int j = 0;
        for (int i = a; i < (a + ((b - a + 1) / 2)); i++) {
            int temp = nums[i];
            nums[i] = nums[b - j];
            nums[b - j] = temp;
            j += 1;
        }
    }
}
