class Solution {
    public boolean isMonotonic(int[] nums) {
        int x = 0, i = 1;

        while (i < nums.length) {
            x = nums[i] - nums[i - 1];
            if (x != 0) break;

            i++;
        }
        
        for (int j = i + 1; j < nums.length; j++) {
            int z = nums[j] - nums[j - 1];

            if (((x > 0) && (z < 0)) || ((x < 0) && (z > 0))) return false;
        } 

        return true;
    }
}
