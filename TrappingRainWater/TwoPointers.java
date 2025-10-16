class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] L = new int[n];
        int[] R = new int[n];
        int[] S = new int[n];
        int x = height[0];
        int y = height[n - 1];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            x = Math.max(x, height[i]);
            L[i] = x;

            y = Math.max(y, height[n - 1 - i]);
            R[n - 1 - i] = y;
        } 

        for (int i = 0; i < n; i++) {
            sum += (Math.min(L[i], R[i]) - height[i]);
        }
        
        return sum;
    }
} 
