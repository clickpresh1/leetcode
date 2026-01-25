class Solution {
    public int maximumDifference(int[] nums) {
        int m = nums.length, mn = Integer.MAX_VALUE, mxDiff = -1;

        boolean mnSeen = false;

        for (int i = 0; i < m; i++) {
            if (!mnSeen) {
                if (nums[i] < mn) {mn = nums[i]; mnSeen = true;}
            } else {
                if (nums[i] < mn) mn = nums[i];
                else if (nums[i] > mn) {
                    int diff = nums[i] - mn;

                    if (diff > mxDiff) mxDiff = diff;
                }
            }
        } 

        return mxDiff;
    }
}
