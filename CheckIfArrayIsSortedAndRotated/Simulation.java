class Solution {
    public boolean check(int[] nums) {
        int m = nums.length, max = nums[0];

        boolean maxSeen = false;

        for (int i = 0; i < m; i++) {
            int k = i % m;
            int q = (i + 1) % m; 

            if (!maxSeen) {
                if (nums[k] > nums[q]) {
                    maxSeen = true;
                } else if (nums[q] > nums[k]) {
                    max = nums[q];
                }
            } else {
                if ((nums[q] > max) || (nums[q] < nums[k])) {
                    return false;
                }
            } 
        } 

        return true;
    } 
}
