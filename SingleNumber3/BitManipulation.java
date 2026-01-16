class Solution {
    public int[] singleNumber(int[] nums) {
        int m = nums.length, b = 0;

        for (int i = 0; i < m; i++) b ^= nums[i];

        int diff = b & (-b), x = 0, y = 0;

        for (int i = 0; i < m; i++) {
            if ((diff & nums[i]) == 0) x ^= nums[i];
            else y ^= nums[i];
        } 

        return new int[] {x, y};
    }
}
