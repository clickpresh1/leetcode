class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int m = nums.length;
        long cnt = 0, locCnt = 0;

        for (int i = 0; i < m + 1; i++) {
            if ((i == m) || (nums[i] != 0)) {
                cnt += (locCnt * ++locCnt) / 2;
                locCnt = 0;
            } else locCnt++;
        }

        return cnt;
    }
} 
