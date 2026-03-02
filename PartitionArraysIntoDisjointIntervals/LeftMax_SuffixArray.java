class Solution {
    public int partitionDisjoint(int[] nums) {
        int m = nums.length;
        int[] right = new int[m];

        int mnr = nums[m - 1];
        for (int i = m - 1; i >= 0; i--) {
            if (nums[i] < mnr) mnr = nums[i];

            right[i] = mnr;
        } 

        int j = -1, mxl = nums[0];
        while ((++j < m - 1) && (mxl > right[j + 1])) {
            if (nums[j] > mxl) mxl = nums[j];
        } 

        return ++j;
    }
}
