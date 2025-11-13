class Solution {
    public boolean divideArray(int[] nums) {
        int b = nums[0];
        int c = nums[0] + 1;
        int d = nums[0] + 2;
        for (int i = 1; i < nums.length; i++) {
            b ^= nums[i];
            c ^= nums[i] + 1;
            d ^= nums[i] + 2; 
        } 

        if ((b == 0) && (c == 0) && (d == 0)) return true;
        else return false;
    }
}
