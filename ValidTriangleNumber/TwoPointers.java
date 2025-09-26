import java.util.Arrays;

class Solution {
    public static int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        for (int i = 2; i < nums.length; i++) {
            int L = 0;
            int R = i - 1;
            
            while (L < R) {
                int check = nums[L] + nums[R];
                if (check > nums[i]) {
                    count += R - L;
                    R--;
                } else {
                    L++;
                } 
                    
            } 
        } 

        return count;
    } 
}
