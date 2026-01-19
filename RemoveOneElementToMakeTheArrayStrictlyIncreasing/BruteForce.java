class Solution {
    public boolean canBeIncreasing(int[] nums) {
        int m = nums.length;

        for (int i = 0; i < m; i++) {
            int currIdx = (i == 0) ? 1 : 0;
            int curr = nums[currIdx];
            boolean sorted = true;
            for (int j = currIdx + 1; j < m; j++) {
                if (i != j) {
                    if (nums[j] <= curr) {
                        sorted = false; break;
                    } 

                    curr = nums[j];
                } 
            } 

            if (sorted) return true;
        } 

        return false;
    }
}
