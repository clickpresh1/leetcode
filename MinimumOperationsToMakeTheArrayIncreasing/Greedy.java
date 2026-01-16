class Solution {
    public int minOperations(int[] nums) {
        int m = nums.length, count = 0;

        for (int i = 1; i < m; i++) {
            int diff = nums[i] - nums[i -  1];

            if (diff > 0) continue;
            else if (diff == 0) {count++; nums[i] += 1;}
            else {
                int adds = (-1 * diff) + 1;
                count += adds;
                nums[i] += adds;
            }

        } 

        return count;
    }
}
