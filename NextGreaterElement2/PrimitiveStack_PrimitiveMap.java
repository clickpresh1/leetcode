class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int m = nums.length;
        int[] stack = new int[m], map = new int[m];
        int top = -1;

        for (int i = 0; i < m; i++) map[i] = -1;

        for (int i = 0; i < m; i++) {
            int w = nums[i];

            while ((top > -1) && (w > nums[stack[top]])) map[stack[top--]] = w;

            stack[++top] = i;
        } 

        for (int i = 0; i < m; i++) {
            int w = nums[i];

            while ((top > -1) && (w > nums[stack[top]])) map[stack[top--]] = w;
        }

        return map;
    }
}
