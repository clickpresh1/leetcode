class Solution {
    public int countKDifference(int[] nums, int k) {
        int m = nums.length, count = 0;
        int[] freq = new int[101];

        for (int i = 0; i < m; i++) {
            freq[nums[i]]++;
        } 

        for (int i = 1; i < 101 - k; i++) {
            if ((freq[i] != 0) && (freq[i + k] != 0)) {
                count += freq[i] * freq[i + k];
            }
        }

        return count;
    }
}
