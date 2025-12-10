class Solution {
    public int[] leftRightDifference(int[] nums) {
        int m = nums.length, sum = 0, leftSum = 0;
        int[] arr = new int[m];

        for (int item : nums) sum += item;

        for (int i = 0; i < m; i++) {
            int rightSum = sum - leftSum - nums[i];

            int k = leftSum - rightSum;
            if (k < 0) k = (-1 * k);

            arr[i] = k;

            leftSum += nums[i];
        } 

        return arr;
    }
}
