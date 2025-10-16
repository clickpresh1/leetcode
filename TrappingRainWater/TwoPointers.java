class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int x = 0;
        int y = n - 1;
        int L = 0;
        int R = 0;
        int sum = 0;

        while (x < y) {
            L = Math.max(L, height[x]);
            R = Math.max(R, height[y]);

            if (L < R) {
                sum += L - height[x];
                x += 1;
            } else {
                sum += R - height[y];
                y -= 1;
            }
        }

        return sum;
    }
} 
