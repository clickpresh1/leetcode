class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length, wrongSum = nums[0], rightSum = (n * (n + 1)) / 2, x = nums[0];

        boolean[] booArr = new boolean[n + 1];

        for (int i = 1; i < n; i++) {
            wrongSum += nums[i];

            if (booArr[nums[i]]) x = nums[i];
            else booArr[nums[i]] = true;
        } 

        // int y = rightSum - wrongSum + x;

        return new int[] {x, rightSum - wrongSum + x};
    }
}
