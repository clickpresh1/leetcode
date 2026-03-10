class Solution {
    public int sumSubarrayMins(int[] arr) {
        int m = arr.length;
        int[] q = new int[m];
        int top = -1;
        long sum = 0;

        for (int i = 0; i < m; i++) {
            int w = arr[i];

            while ((top > -1) && (w <= arr[q[top]])) {
                int f = q[top--];

                int x = top == -1 ? -1 : q[top];
                int y = i;

                long g = arr[f];

                sum += g * (f - x) * (y - f);
            } 

            q[++top] = i;
        } 

        while (top > -1) {
            int f = q[top--];

            int x = top == -1 ? -1 : q[top];
            int y = m;

            long g = arr[f];

            sum += g * (f - x) * (y - f);
        } 

        return (int) (sum % 1000000007);
    }
}
