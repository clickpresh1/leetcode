class Solution {
    public int unequalTriplets(int[] nums) {
        int m = nums.length, count = 0;

        for (int i = 0; i < m - 2; i++) {
            for (int j = i + 1; j < m - 1; j++) {
                for (int k = j + 1; k < m; k++) {
                    if ((nums[i] != nums[j]) && (nums[i] != nums[k]) && (nums[j] != nums[k])) count++;
                }
            }
        } 

        return count;
    }
}
