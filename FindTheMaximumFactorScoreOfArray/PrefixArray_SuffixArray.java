class Solution {
    public long maxScore(int[] nums) {
        int m = nums.length;

        if (m == 1) return nums[0] * nums[0];

        long[] prefixGCD = new long[m], suffixGCD = new long[m];
        long[] prefixLCM = new long[m], suffixLCM = new long[m];

        prefixGCD[0] = nums[0];
        prefixLCM[0] = nums[0];

        for (int i = 1; i < m; i++) {
            prefixGCD[i] = gcd(prefixGCD[i - 1], nums[i]);
            prefixLCM[i] = lcm(prefixLCM[i - 1], nums[i]);
        } 

        suffixGCD[m - 1] = nums[m - 1];
        suffixLCM[m - 1] = nums[m - 1];
        
        for (int i = m - 2 ; i >= 0; i--) {
            suffixGCD[i] = gcd(suffixGCD[i + 1], nums[i]);
            suffixLCM[i] = lcm(suffixLCM[i + 1], nums[i]);
        } 

        long max = prefixGCD[m - 1] * prefixLCM[m - 1];
        long res = 0;

        for (int i = 0; i < m; i++) {
            if (i == 0) {
                res = suffixGCD[1] * suffixLCM[1];
            } else if (i == m -1) {
                res = prefixGCD[m - 2] * prefixLCM[m - 2];
            } else {
                long g = gcd(prefixGCD[i -1], suffixGCD[i + 1]);
                long l = prefixLCM[i - 1] * (suffixLCM[i + 1] / gcd(prefixLCM[i - 1], suffixLCM[i + 1]));
                res = g * l;
            } 

            if (res > max) max = res;
        }

        return max;
    } 

    public static long gcd(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        } 

        return a;
    } 

    public static long lcm(long a, long b) {

        return a * (b / (gcd(a, b)));
    }
}
