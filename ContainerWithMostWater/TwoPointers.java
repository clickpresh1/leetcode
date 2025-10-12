class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int x = 0;
        int y = n - 1;
        int minHeight = Math.min(height[x], height[y]);
        int currAmount = minHeight * (y - x);
        int currMax = currAmount;

        while (x < y) {
            if (height[x] <= height[y]) {
                x += 1;
                minHeight = Math.min(height[x], height[y]);
                currAmount = minHeight * (y - x);
            } else if (height[x] > height[y]) {
                y -= 1;
                minHeight = Math.min(height[x], height[y]);
                currAmount = minHeight * (y - x);
            } 

            currMax = Math.max(currMax, currAmount);
        } 

        return currMax;
    } 
}
