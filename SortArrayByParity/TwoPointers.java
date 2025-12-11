class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int m = nums.length, x = 0;

        for (int i = 0; i < m; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[x];
                nums[x] = temp;
                x++;
            } 
        } 

        return nums;
    }
}
