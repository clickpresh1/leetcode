class Solution {
    public int missingNumber(int[] nums) {
        int sumN = (nums.length * (nums.length + 1)) / 2;
        int sumL = 0;
        for (int i = 0; i < nums.length; i++) {
            sumL += nums[i];
        } 
        
        return sumN - sumL;
    }
}
