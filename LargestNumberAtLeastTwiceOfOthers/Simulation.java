class Solution {
    public int dominantIndex(int[] nums) {
        int x = 0, x2 = 0, max = 0, max2 = 0, m = nums.length;

        for (int i = 0; i < m; i++) {
            if (nums[i] > max) {
                max2 = max;
                max = nums[i];
                x2 = x;
                x = i;
            } else if (nums[i] > max2) {
                max2 = nums[i];
                x2 = i;
            }
        } 

        return (max >= (2 * max2)) ? x : -1;
    }
}
