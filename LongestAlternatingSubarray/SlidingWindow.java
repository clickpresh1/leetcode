class Solution {
    public int alternatingSubarray(int[] nums) {
        int m = nums.length, len = -1, u = 1;

        while (u < m) {
            int v = u, diff = 1;
            while ((v < m) && (nums[v] - nums[v - 1] == diff)) {
                diff *= -1;
                v++;
            } 

            int x = v - u + 1;

            if ((x != 1) && (x > len)) len = x;

            u = (u == v) ? ++u : v;
        } 

        return len;
    }
}
