import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int sum = 0;
        int result = 0;
        int helper = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {

            int j = i + 1;
            int k = nums.length - 1;

            while (j < k) {
                sum = nums[i] + nums[j] + nums[k];
                int diff = Math.abs(target - sum);
                if (diff <= helper) {
                    helper = diff;
                    result = sum;
                } 

                if (sum < target) {
                    j++;
                } else if (sum > target) {
                    k--;
                } else {
                    j++;
                    k--;
                }
                
            }
        } 

        return result;  
    }
}
