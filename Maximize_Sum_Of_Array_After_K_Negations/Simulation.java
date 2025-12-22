class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int m = nums.length;

        for (int i = 0; i < k; i++) {
            for (int j = 0; j < m - 1; j++) {
                if (nums[j] < nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            } 

            nums[m - 1] *= -1;
        } 

        int sum = 0;
        for (int i = 0; i < m; i++) sum += nums[i];

        return sum;
    }
}
