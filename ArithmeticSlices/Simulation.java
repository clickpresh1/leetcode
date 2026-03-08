class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int m = nums.length, cnt = 0;

        if (m < 3) return 0;

        int diff = nums[1] - nums[0], currCnt = 1, j = 0;
        for (int i = 2; i < m; i++) {
            if (nums[i] - nums[i - 1] == diff) {
                currCnt++;

                if (currCnt >= 2) cnt += ++j;
            } else {
                diff = nums[i] - nums[i - 1];
                currCnt = 1;
                j = 0;
            }
        } 

        return cnt;
    }
}
