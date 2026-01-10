class Solution {
    public int[] applyOperations(int[] nums) {
        int m = nums.length;

        for (int i = 0; i < m - 1; i++) {
            if ((nums[i] != 0) && (nums[i] == nums[i + 1])) {
                nums[i] <<= 1; 
                nums[i + 1] = 0;
                i++;
            } 
        } 

        int x = 0;

        for (int i = 0; i < m; i++) {
            if (nums[i] != 0) nums[x++] = nums[i];
        } 

        Arrays.fill(nums, x, m, 0);        

        return nums;
    }
}
