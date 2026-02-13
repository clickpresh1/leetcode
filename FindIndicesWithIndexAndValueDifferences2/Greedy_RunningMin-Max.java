class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int m = nums.length, f = indexDifference, g = valueDifference;
        int mnIndx = 0, mxIndx = 0;

        for (int i = f; i < m; i++) {
            int k = i - f;

            if (nums[k] < nums[mnIndx]) mnIndx = k;
            if (nums[k] > nums[mxIndx]) mxIndx = k;

            int a = Math.abs(nums[i] - nums[mnIndx]);
            int b = Math.abs(nums[i] - nums[mxIndx]);

            if (a >= g) return new int[] {i, mnIndx};
            if (b >= g) return new int[] {i, mxIndx};
        } 

        return new int[] {-1, -1};
    }
}
