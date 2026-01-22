class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int m = nums.length, min = Integer.MAX_VALUE;

        for (int i = 0; i < m; i++) {
            if (nums[i] == target) {
                int k = Math.abs(i - start);
                if (k < min) min = k;
            } 
        } 

        return min;
    }
}
