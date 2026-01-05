class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int count = 0;

        for (int item : nums) {
            if ((item & 1) == 0) {
                count++;
                
                if (count == 2) return true;
            }
        } 

        return false;
    }
}
