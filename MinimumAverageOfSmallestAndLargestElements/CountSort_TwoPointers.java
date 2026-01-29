class Solution {
    public double minimumAverage(int[] nums) {
        int m = nums.length;
        int[] freq = new int[51], sums = new int[101];

        for (int item : nums) freq[item]++;

        for (int i = 1, j = 0; i < 51; i++) {
            while (freq[i]-- > 0) nums[j++] = i;
        } 

        int x = 0, y = m - 1, mn = 101;
        while (x < y) {
            int z = nums[x] + nums[y];
            sums[z]++;

            if (z < mn) mn = z;

            x++; y--;
        } 

        // return (mn * 1.0) / 2;
        return mn / 2.0;
    }
}
