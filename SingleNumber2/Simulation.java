class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int m = nums.length;

        for (int i = 0; i < m - 1; i += 3) {
            if (nums[i] != nums[i + 2]) return nums[i];
        }

        return nums[m - 1];        
    }
}
