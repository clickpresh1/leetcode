class Solution {
    public int uniquePaths(int m, int n) {
        int a = (m - 1) + (n - 1);
        int b = Math.max(m - 1, n - 1);
        int result = 1;
        int q = 1;

        for (int i = a; i > b; i--) {
            q = q * (i - b);
            result *= i;
            int gcd = gcd(result, q);
            result = result / gcd;
            q = q / gcd;
        } 

        return result;
    } 

    public static int gcd(int a, int b) {
        a = Math.abs(a); 
        b = Math.abs(b);
        /* for a and b, we do not have to worry about integers greater than or equal to Integer.MAX_VALUE, and integers less than or equal to Integer.MIN_VALUE, because the constraints of the question puts 1 <= m, n <= 100 */ 

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        } 

        return a;
    }
}
