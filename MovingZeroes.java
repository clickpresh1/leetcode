// DRAFT
// DRAFT
// DRAFT

import java.util.Arrays;

class Solution {
    public static void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] == 0) && (i + 1 < nums.length)) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        int helper = nums[j];
                        nums[j] = nums[i];
                        nums[i] = helper;
                        break;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(nums));
        
    } 

}
