class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int item : nums) {
            if (item > max) max = item;
            if (item < min) min = item;
        }

        int res = (max - k) - (min + k);

        return (res > 0) ? res : 0;
    }
}
