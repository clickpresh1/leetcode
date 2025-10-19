class Solution {
    public static int maxDistinctElements(int[] nums, int k) {
        int m = nums.length;
        if (m == 1) return 1;
        Arrays.sort(nums);
        int count = 0;
        int nextLeast = Integer.MIN_VALUE;

        for (int i = 0; i < m; i++) {
            int minVal = nums[i] - k;
            nums[i] = Math.max(minVal, nextLeast);

            if (i < m - 1) {
                nextLeast = nums[i];
                if (nextLeast + 1 <= nums[i + 1] + k) {
                    nextLeast += 1;
                }
            }

            if (i > 0) {
                if (nums[i] > nums[i - 1]) {
                    count += 1;
                }
            } else {
                count = 1;
            }
        } 

        return count;
    } 
}
