class Solution {
    public double myPow(double x, int n) {
        if ((x == 0) || (x == 1)) {
            return x;
        } 

        long nLong = n;
        
        if (nLong < 0) {
            System.out.println(exp(x, -nLong));
            return 1 / exp(x, -nLong);
        } else {
            return exp(x, nLong);
        }

    } 

    public static double exp(double a, long b) {
        if ((a == 1) && (b == 0)) {
            return 1;
        } 

        if ((a == -1) && (b % 2 == 0)) {
            return 1;
        } else if ((a == -1) && (b % 2 != 0)) {
            return -1;
        } 

        double result = 1;
        double base = a;
        String con = "";
        long q = b / 2;
        long rem = b % 2;
        con += rem;
        if (rem == 1) {
            result = result * base;
            base = base * base;
        } else {
            base = base * base;
        }
        while (q != 0) {
            rem = q % 2;
            if (rem == 1) {
                result = result * base;
                base = base * base;
            } else {
                base = base * base;
            }
            con = rem + con;
            q = q / 2;
        } 

        return result;
    }
}
