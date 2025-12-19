class Solution {
    public int countHillValley(int[] nums) {
        int m = nums.length;

        if (m <= 2) return 0;

        int x = 0, c = 0;

        for (int i = 1; i < m - 1; i++) {
            if (nums[i] == nums[i + 1]) continue;
            else {
                int y = i + 1;
                if ((nums[x] > nums[i]) && (nums[y] > nums[i])) c++;
                else if ((nums[x] < nums[i]) && (nums[y] < nums[i])) c++;

                x = i;
            } 
        } 

        return c;
    } 
}
