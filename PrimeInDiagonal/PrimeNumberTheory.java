class Solution {
    public int diagonalPrime(int[][] nums) {
        int m = nums.length, n = nums[0].length, mx = 0;

        for (int i = 0; i < m; i++) {
            int a = nums[i][i], b = nums[i][m - 1 - i];

            if (isPrime(a)) {
                if (a > mx) mx = a;
            } 

            if (isPrime(b)) {
                if (b > mx) mx = b;
            }
        } 

        return mx;
    } 

    public static boolean isPrime(int v) {
        if (v == 1) return false;
        if (v <= 3) return true;

        if ((v % 2 == 0) || (v % 3 == 0)) return false;

        for (int i = 5; i * i <= v; i += 2) {
            if (v % i == 0) return false;
        } 

        return true;
    }
}
