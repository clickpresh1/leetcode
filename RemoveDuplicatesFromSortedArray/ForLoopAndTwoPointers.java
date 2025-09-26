class Solution {
    public int removeDuplicates(int[] nums) {
        int p1= 0;
        int p2 = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[p1]) {
                p1 = i;
            } else {
                p2++;
                nums[p2] = nums[i];
                p1 = i;
            }
        } 

        return p2 + 1; 
    }
}
