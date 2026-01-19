class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int m = nums.length, a = -1;

        if (m == 2) return true;

        for (int i = 1; i < m; i++) {
            if (nums[i] <= nums[i - 1]) {
                if (a != -1) return false;
                else a = i - 1;
            }
        } 

        if (a == -1) return true;

        if (a == 0) {
            if (a + 2 < m) {
                if (nums[a + 2] > nums[a]) return true;
                else {
                    if (nums[a + 2] > nums[a + 1]) return true;
                    else return false;
                }
            } else {
                return false;
            }
        } else {
            if (nums[a + 1] > nums[a - 1]) return true;
            else {
                if (a + 2 < m) {
                    if (nums[a + 2] > nums[a]) return true;
                    else return false;
                } else {
                    return true;
                }
            }
        }
    }
}
