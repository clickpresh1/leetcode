import java.util.Arrays;
class Solution {
    public void moveZeroes(int[] nums) {
        int val = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int helper = nums[val];
                nums[val] = nums[i];
                nums[i]= helper;
                val += 1;
            }
        }  
    }
}
