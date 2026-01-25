class Solution {
    public int countPairs(int[] nums, int k) {
        int m = nums.length, count = 0;

        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j < m; j++) {
                if (nums[i] == nums[j]) {
                    if ((i * j) % k == 0) count++;
                }
            }
        } 

        return count;
    }
}
