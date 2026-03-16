class Solution {
    public int totalHammingDistance(int[] nums) {
        int m = nums.length, cnt = 0;

        for (int i = 0; i < 32; i++) {
            int bitmask = 1 << i, zeros = 0, ones = 0;

            for (int item : nums) {
                if ((item & bitmask) == 0) zeros++;
                else ones++;
            } 

            cnt += zeros * ones;
        } 

        return cnt;
    } 
}
