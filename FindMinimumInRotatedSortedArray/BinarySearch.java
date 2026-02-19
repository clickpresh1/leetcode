class Solution {
    public int findMin(int[] nums) {
        int m = nums.length;
        if (m == 1) return nums[0];
        if (nums[m - 1] > nums[0]) return nums[0];

        int x = 0, y = m - 1;
        
        while (x <= y) {
            int mid = x + ((y - x) / 2);

            int u = (mid + m - 1) % m, v = (mid + m + 1) % m;

            int e = nums[u], f = nums[mid], g = nums[v];

            if ((f > e) && (f > g)) return g;
            else if ((f < e) && (f < g)) return f;
            else if (f < nums[y]) y = (mid - 1 + m) % m;
            else if (f > nums[y]) x = (mid + 1 + m) % m;
        } 

        return nums[0];
    }
}
