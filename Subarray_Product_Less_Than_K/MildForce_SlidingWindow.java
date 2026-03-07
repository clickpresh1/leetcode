class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int m = nums.length, runProd = 1, mx = 0, l = 0;

        if ((k == 0) || (k == 1)) return 0;

        for (int i = 0; i < m; i++) {
            int item = nums[i];
            if (runProd * item < k) {
                runProd *= item;
                mx += (i - l + 1);
            } else {
                if (item < k) {
                    while (runProd * item >= k) runProd /= nums[l++];

                    i--;
                } else {
                    runProd = 1;
                    l = i + 1;
                }
            }
        }

        return mx;
    }
}
