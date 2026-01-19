class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int m = nums.length, a = -1;

        for (int i = 1; i < m; i++) {
            if (nums[i] <= nums[i - 1]) {
                if (a != -1) return false;
                else a = i - 1;
            }
        } 

        for (int item = a; item < (a + 2); item++) {
            int currIndx = (item == 0) ? 1 : 0;
            int curr = nums[currIndx];
            boolean sorted = true;

            for (int i = currIndx + 1; i < m; i++) {
                if (i != item) {
                    if (nums[i] <= curr) {sorted = false; break;}

                    curr = nums[i];
                }
            } 

            if (sorted) return true;
        }

        return false;
    }
}
