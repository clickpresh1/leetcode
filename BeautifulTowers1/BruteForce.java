class Solution {
    public long maximumSumOfHeights(int[] heights) {
        int m = heights.length;
        long totalSum = 0, mx = -1;
        for (int i = 0; i < m; i++) totalSum += heights[i];

        for (int i = 0; i < m; i++) {
            long sum1 = 0, sum2 = 0;

            int j = i;
            int prev = heights[j];
            while (--j >= 0) {
                int u = heights[j];
                
                if (u > prev) sum1 += u - prev;
                else prev = u;
            } 

            j = i;
            prev = heights[j];
            while (++j < m) {
                int u = heights[j];

                if (u > prev) sum2 += u - prev;
                else prev = u;
            } 

            long sum = totalSum - (sum1 + sum2);

            if (sum > mx) mx = sum;
        } 

        return mx;
    }
}
