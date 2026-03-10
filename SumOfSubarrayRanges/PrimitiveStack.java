class Solution {
    public long subArrayRanges(int[] nums) {
        int m = nums.length;
        long sumMx = 0, sumMn = 0;
        int[] q = new int[m];
        int top = -1;

        for (int i = 0; i < m; i++) {
            int w = nums[i];

            while ((top > -1) && (w >= nums[q[top]])) {
                int f = q[top--];

                int x = top == -1 ? -1 : q[top];
                int y = i;

                long g = nums[f];

                sumMx += g * (f - x) * (y - f);
            } 

            q[++top] = i;
        } 

        while (top > -1) {
            int f = q[top--];

            int x = top == -1 ? -1 : q[top];
            int y = m;

            long g = nums[f];

            sumMx += g * (f - x) * (y - f);
        } 

        for (int i = 0; i < m; i++) {
            int w = nums[i];

            while ((top > -1) && (w <= nums[q[top]])) {
                int f = q[top--];

                int x = top == -1 ? -1 : q[top];
                int y = i;

                long g = nums[f];

                sumMn += g * (f - x) * (y - f);
            } 

            q[++top] = i;
        } 

        while (top > -1) {
            int f = q[top--];

            int x = top == -1 ? -1 : q[top];
            int y = m;

            long g = nums[f];

            sumMn += g * (f - x) * (y - f);
        } 

        return sumMx - sumMn;
    }
}
