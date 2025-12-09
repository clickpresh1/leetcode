class Solution {
    public int pivotIndex(int[] nums) {
        int m = nums.length, sum = 0;
        int[] L = new int[m];

        L[0] = 0;
        sum += nums[0];
        for (int i = 1; i < m; i++) {
            L[i] = L[i - 1] + nums[i - 1];
            sum += nums[i];
        } 

        for (int i = 0; i < nums.length; i++) {
            if ((sum - L[i] - nums[i]) == L[i]) return i;
        }

        return -1;
    }
}
