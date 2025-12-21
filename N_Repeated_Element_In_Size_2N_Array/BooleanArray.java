class Solution {
    public int repeatedNTimes(int[] nums) {
        int m = nums.length, n = m / 2;
        boolean[] boo = new boolean[10000];

        for (int i = 0; i < m; i++) {
            if (!boo[nums[i]]) boo[nums[i]] = true;
            else return nums[i];
        } 

        return 0;
    }
}
