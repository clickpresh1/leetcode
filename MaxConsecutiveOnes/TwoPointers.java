class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int x = 0, y = 0;
        
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) x += 1;
            else {
                y = Math.max(x, y);
                x = 0;
            } 
        } 

        y = Math.max(x, y);

        return y;
    }
}
