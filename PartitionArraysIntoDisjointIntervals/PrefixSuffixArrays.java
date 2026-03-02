class Solution {
    public int partitionDisjoint(int[] nums) {
        int m = nums.length;
        int[] left = new int[m], right = new int[m];

        int mxl = nums[0];
        for (int i = 0; i < m; i++) {
            if (nums[i] > mxl) mxl = nums[i];

            left[i] = mxl;
        } 

        int mnr = nums[m - 1];
        for (int i = m - 1; i >= 0; i--) {
            if (nums[i] < mnr) mnr = nums[i];

            right[i] = mnr;
        } 

        int j = -1;
        while ((++j < m - 1) && (left[j] > right[j + 1])) {}

        return ++j;
    }
}
