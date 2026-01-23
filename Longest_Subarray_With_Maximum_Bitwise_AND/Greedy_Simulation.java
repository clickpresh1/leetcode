class Solution {
    public int longestSubarray(int[] nums) {
        int m = nums.length, max = 0, maxLen = 0;

        for (int item : nums) {
            if (item > max) max = item;
        }

        int i = 0;
        while (i < m) {
            if (nums[i] == max) {
                int j = 0, locLen = 0;
                while (i + j < m) {
                    if (nums[i + j] == max) locLen++;
                    else break;

                    j++;
                } 

                if (locLen > maxLen) maxLen = locLen;

                i += j;

            } else i++;
        }

        return maxLen;
    }
}
