class Solution {
    public int specialArray(int[] nums) {
        int m = nums.length;

        for (int i = 1; i < m + 1; i++) {
            int count = 0;

            for (int j = 0; j < m; j++) if (nums[j] >= i) count++;

            if (count == i) return i;
        } 

        return -1;
    } 
}
