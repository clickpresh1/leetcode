class Solution {
    public void moveZeroes(int[] nums) {
        int m = nums.length, x = 0;

        for (int i = 0; i < m; i++) {
            if (nums[i] != 0) nums[x++] = nums[i];
        } 

        for (int i = x; i < m; i++) nums[i] = 0;
    }
}
