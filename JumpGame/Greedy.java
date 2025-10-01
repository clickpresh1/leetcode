class Solution {
    public boolean canJump(int[] nums) {
        boolean canJump = true;
        int jump = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > jump) {
                canJump = false;
                break;
            } else {
                jump = Math.max(jump, i + nums[i]);
            }
            
        }
          
        return canJump;
    } 
}
