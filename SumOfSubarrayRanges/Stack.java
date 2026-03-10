class Solution {
    public long subArrayRanges(int[] nums) {
        int m = nums.length;
        long sumMx = 0, sumMn = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < m; i++) {
            int w = nums[i];

            while ((!stack.isEmpty()) && (w >= nums[stack.peek()])) {
                int f = stack.pop();

                int x = stack.isEmpty() ? -1 : stack.peek();
                int y = i;

                long g = nums[f];

                sumMx += g * (f - x) * (y - f);
            } 

            stack.push(i);
        } 

        while (!stack.isEmpty()) {
            int f = stack.pop();

            int x = stack.isEmpty() ? -1 : stack.peek();
            int y = m;

            long g = nums[f];

            sumMx += g * (f - x) * (y - f);
        } 

        for (int i = 0; i < m; i++) {
            int w = nums[i];

            while ((!stack.isEmpty()) && (w <= nums[stack.peek()])) {
                int f = stack.pop();

                int x = stack.isEmpty() ? -1 : stack.peek();
                int y = i;

                long g = nums[f];

                sumMn += g * (f - x) * (y - f);
            } 

            stack.push(i);
        } 

        while (!stack.isEmpty()) {
            int f = stack.pop();

            int x = stack.isEmpty() ? -1 : stack.peek();
            int y = m;

            long g = nums[f];

            sumMn += g * (f - x) * (y - f);
        } 

        return sumMx - sumMn;
    }
}
