class Solution {
    public int arraySign(int[] nums) {
        int count = 0;
        
        for (int item : nums) {
            if (item < 0) count++;
            else if (item == 0) return 0;
        } 

        return ((count & 1) == 0) ? 1 : -1;
    }
}
