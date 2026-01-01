class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int m = nums.length;
        int[] freq = new int[101];

        for (int i = 0; i < m; i++) freq[nums[i]]++;

        int freqCumCount = 0;
        for (int i = 0; i < 101; i++) {
            int f = freqCumCount;
            freqCumCount += freq[i];
            freq[i] = f;
        } 

        for (int i = 0; i < m; i++) {
            nums[i] = freq[nums[i]];
        }

        return nums;
    }
}
