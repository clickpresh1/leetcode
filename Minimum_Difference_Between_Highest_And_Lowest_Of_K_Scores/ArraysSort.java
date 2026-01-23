class Solution {
    public int minimumDifference(int[] nums, int k) {
        int m = nums.length;

        Arrays.sort(nums);

        int diff = Integer.MAX_VALUE;

        for (int i = 0; i < m - k + 1; i++) {
            int localDiff = nums[i + k - 1] - nums[i];

            if (localDiff < diff) diff = localDiff;
        } 

        return diff;
    }
}
