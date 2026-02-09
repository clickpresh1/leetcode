class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int m = nums.length, len = 0, u = 0;
        
        while (u < m) {
            if ((nums[u] > threshold) || (nums[u] % 2 != 0)) {
                u++;
                continue;
            } 

            int v = u, mod = 0;

            while ((v < m) && (nums[v] <= threshold) && (nums[v] % 2 == mod)) {
                mod ^= 1;
                v++;
            } 

            int locLen = v - u;
            if (locLen > len) len = locLen;

            u = (u == v) ? ++u : v;
        } 

        return len;
    }
}
