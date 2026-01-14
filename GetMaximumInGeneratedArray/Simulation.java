class Solution {
    public int getMaximumGenerated(int n) {
        if ((n == 0) || (n == 1)) return n;

        int[] nums = new int[n + 1];
        int max = 0;

        nums[0] = 0; nums[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            if (i % 2 == 0) nums[i] = nums[i / 2];
            else nums[i] = nums[i / 2] + nums[(i / 2) + 1];

            if (nums[i] > max) max = nums[i];
        } 

        return max;
    }
}
