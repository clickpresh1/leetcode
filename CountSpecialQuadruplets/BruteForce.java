class Solution {
    public int countQuadruplets(int[] nums) {
        int m = nums.length, count = 0;

        for (int i = 0; i < m - 3; i++) {
            for (int j = i + 1; j < m - 2; j++) {
                for (int k = j + 1; k < m - 1; k++) {
                    for (int l = k + 1; l < m; l++) {
                        if (nums[i] + nums[j] + nums[k] == nums[l]) count++;
                    }
                }
            }
        } 

        return count;
    }
}
