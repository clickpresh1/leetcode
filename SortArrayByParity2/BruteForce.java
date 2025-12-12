class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int m = nums.length, k = 0;

        if ((m == 2) && (nums[0] % 2 != 0)) {
            swap(nums, 1, 0);
            return nums;
        }

        while (k < m / 4) {
            int x = -1, y = -1;

            for (int i = 0; i < m; i++) {
                if ((nums[i] % 2 == 0) && (i % 2 != 0)) {
                    x = i;
                } 

                if ((nums[i] % 2 != 0) && (i % 2 == 0)) {
                    y = i;
                } 

                if ((x != -1) && (y != -1)) {
                    swap(nums, x, y);
                    x = -1;
                    y = -1;
                } 
            } 

            k++;
        }

        return nums;
    } 

    public static void swap(int[] nums, int x, int y) {
        int temp = nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    } 
}
