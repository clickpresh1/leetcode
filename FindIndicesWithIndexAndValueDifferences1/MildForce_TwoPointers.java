class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int m = nums.length, f = indexDifference, g = valueDifference;

        for (int i = 0; i < m; i++) {
            int y = m - 1;
            while (i <= y) {
                int a = Math.abs(i - y);
                int b = Math.abs(nums[i] - nums[y]);
                if ((a >= f) && (b >= g)) return new int[] {i, y};
                else if (a < f) break;
                else if (b < g) y--;
            }
        } 

        return new int[] {-1, -1};
    }
}
