// I HAVE NO IDEA WHY THIS CODE IS BROKEN!!
// I HAVE NO IDEA WHY THIS CODE IS BROKEN!!
// I HAVE NO IDEA WHY THIS CODE IS BROKEN!!

import java.util.Arrays;

class Solution {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            int L = i + 1;
            int R = nums.length - 1;
            
            while (L < R) {
                int check = nums[i] + nums[L];
                if (check > nums[R]) {
                    count += R - L;
                    L++;
                    // R = nums.length - 1;
                } else {
                    R--;
                } 
                    
            } 
        } 

        return count;
    } 
}
