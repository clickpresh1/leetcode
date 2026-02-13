class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int m = nums.length, f = indexDifference, g = valueDifference;
        int mxIndx = 0, mnIndx = 0;

        for (int i = f; i < m; i++) {
            int k = i - f;
            if (nums[k] > nums[mxIndx]) mxIndx = k;
            if (nums[k] < nums[mnIndx]) mnIndx = k;

            int a = Math.abs(nums[i] - nums[mxIndx]);
            int b = Math.abs(nums[i] - nums[mnIndx]);

            if (a >= g) return new int[] {i, mxIndx};
            if (b >= g) return new int[] {i, mnIndx};
        }

        return new int[] {-1, -1};
    }
}
