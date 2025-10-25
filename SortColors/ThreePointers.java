class Solution {
    public void sortColors(int[] nums) {
        int m = nums.length;

        int x = 0;
        int y = 0;
        int z = m - 1;

        while (y <= z) {
            if (nums[y] == 0) {
                int temp = nums[x];
                nums[x] = nums[y];
                nums[y] = temp;
                x += 1;
                y += 1;
            } else if (nums[y] == 1) {
                y += 1;
            } else {
                int temp = nums[y];
                nums[y] = nums[z];
                nums[z] = temp;
                z -= 1;
            }
        }
    }
}
