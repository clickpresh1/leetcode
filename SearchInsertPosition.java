class Solution {
    public int searchInsert(int[] nums, int target) {
        int ind = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                ind = i;
                break;
            } else {
                count += 1;
            }
        } 
        if (count == nums.length) {
            ind = nums.length;
        } 

        return ind;
    }
}
