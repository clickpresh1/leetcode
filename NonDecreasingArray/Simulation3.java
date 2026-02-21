class Solution {
    public boolean checkPossibility(int[] nums) {
        int m = nums.length, cnt = 0;

        for (int i = 0; i < m - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                cnt++;

                if (cnt > 1) return false;

                if (i > 0) {
                    if (nums[i + 1] < nums[i - 1]) nums[i + 1] = nums[i];
                    else nums[i] = nums[i + 1];
                } else nums[i] = nums[i + 1];
            }
        }

        return true;
    } 
}
