class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int gloSum = Integer.MIN_VALUE, locSum = 0, q = k;

        while (q > 0) locSum += nums[--q];

        if (locSum > gloSum) gloSum = locSum;

        for (int i = 1; i <= nums.length - k; i++) {
            locSum += nums[k - 1 + i] - nums[i - 1];

            if (locSum > gloSum) gloSum = locSum;
        } 

        return (gloSum * 1.0) / k;
    }
}
