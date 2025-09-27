class Solution {
    public int divide(int dividend, int divisor) {

        int quotient = 0;
        
        int num = 0;
        int denom = 0;
        int plus = 0;

        if ((dividend == Integer.MIN_VALUE) && (divisor == Integer.MIN_VALUE)) {
            return 1;
        }

        if ((dividend == Integer.MIN_VALUE) && (divisor == -1)) {
            return Integer.MAX_VALUE;
        } else if ((dividend == Integer.MIN_VALUE) && (divisor == 1)) {
            return Integer.MIN_VALUE;
        } else if ((dividend == Integer.MAX_VALUE) && (divisor == -1)) {
            return Integer.MIN_VALUE + 1;
        } else if ((dividend == Integer.MAX_VALUE) && (divisor == 1)) {
            return Integer.MAX_VALUE;
        }

        if (dividend == Integer.MIN_VALUE) {
            num = Integer.MAX_VALUE;
            plus = -1;
        } else {
            num = Math.abs(dividend);
        }

        if (divisor == Integer.MIN_VALUE) {
            return 0;
        } else {
            denom = Math.abs(divisor);
        }

        while (num >= denom) {
            num = num - denom;
            quotient++;

            if (quotient == Integer.MAX_VALUE) {
                break;
            }
        } 

        if ((dividend == Integer.MIN_VALUE) && ((num + 1) - denom == 0)) {
            quotient++;
        }

        if ((dividend > 0) && (divisor < 0)) {
            quotient = -1 * quotient;
        } else if ((dividend < 0) && (divisor > 0)) {
            quotient = (-1 * quotient);
        } 

        return quotient;
    } 
}
