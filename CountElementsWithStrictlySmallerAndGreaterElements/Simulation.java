class Solution {
    public int countElements(int[] nums) {
        int count = 0, m = nums.length, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int i = 0; i < m; i++) {
            if (nums[i] > max) max = nums[i];

            if (nums[i] < min) min = nums[i];
        } 

        for (int i = 0; i < m; i++) {
            if ((nums[i] > min) && (nums[i] < max)) count++;
        } 

        return count;
    }
}
