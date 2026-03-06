class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int m = nums.length;
        long cnt = 0, locCnt = 0;

        for (int item : nums) {
            if (item != 0) locCnt = 0;
            else cnt += ++locCnt;
        }

        return cnt;
    }
} 
