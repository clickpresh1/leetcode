class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int m = nums.length;
        int runProd = 1;
        int runCnt = 0, mx = runCnt;

        if ((k == 0) || (k == 1)) return 0;

        int l = 0;
        for (int i = 0; i < m; i++) {
            if (runProd * nums[i] < k) {
                runProd *= nums[i];
                mx += ++runCnt;
            } else {
                if (nums[i] < k) {
                    runProd /= nums[l];
                    i--;
                    runCnt--;
                    l++;
                } else {
                    runProd = 1;
                    runCnt = 0;
                    l = i + 1;
                }
            }
        } 

        return mx;
    }
}
