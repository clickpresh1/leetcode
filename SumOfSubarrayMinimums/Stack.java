class Solution {
    public int sumSubarrayMins(int[] arr) {
        int m = arr.length;
        Stack<Integer> q = new Stack<>();
        long sum = 0;

        for (int i = 0; i < m; i++) {
            int w = arr[i];

            while ((!q.isEmpty()) && (w <= arr[q.peek()])) {
                int f = q.pop();

                int x = q.isEmpty() ? -1 : q.peek();
                int y = i;

                long g = arr[f];

                sum += g * (f - x) * (y - f);
            } 

            q.push(i);
        } 

        while (!q.isEmpty()) {
            int f = q.pop();

            int x = q.isEmpty() ? -1 : q.peek();
            int y = m;

            long g = arr[f];

            sum += g * (f - x) * (y - f);
        } 

        return (int) (sum % 1000000007);
    }
}
