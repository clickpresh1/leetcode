class Solution {
    public int findShortestSubArray(int[] nums) {
        int m = nums.length, max = 0, maxElement = -1, minLen = m;
        int[] freq = new int[50000], indx = new int[50000];

        for (int i = 0; i < m; i++) {
            int k = nums[i];
            freq[k]++;

            if (freq[k] == 1) {
                indx[k] = i;
                if (freq[k] > max) {
                    max = freq[k];
                    minLen = 1;
                }
            }
            else {
                if (freq[k] > max) {
                    max = freq[k];
                    minLen = i - (indx[k]) + 1;
                } else if (freq[k] == max) {
                    int q = i - (indx[k]) + 1;
                    if (q < minLen) {
                        minLen = q;
                        max = freq[nums[i]];
                    }
                }
            }
        } 

        return minLen;
    }
}
