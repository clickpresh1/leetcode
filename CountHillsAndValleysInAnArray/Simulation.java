class Solution {
    public int countHillValley(int[] nums) {
        int m = nums.length, c = 0;

        if (m <= 2) return 0;

        for (int i = 1; i < m - 1; i++) {
            if (nums[i] == nums[i - 1]) continue;

            int x = i - 1;

            int y = i + 1;
            while (y < m) {
                if (nums[y] != nums[i]) break;

                y++;
            } 

            if (y == m) continue;

            if ((nums[x] > nums[i]) && (nums[y] > nums[i])) c++;
            else if ((nums[x] < nums[i]) && (nums[y] < nums[i])) c++;
        } 

        return c;
    } 
}
