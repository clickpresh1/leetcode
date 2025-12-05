class Solution {
    public int minimumSum(int num) {
        int a = 0, b = 0, c = 0, d = 0;

        while (num > 0) {
            int p = num % 10;

            if (p >= a) {
                d = c;
                c = b;
                b = a;
                a = p;
            } else if ((a > p) && (p >= b)) {
                d = c;
                c = b;
                b = p;
            } else if ((a > p) && (b > p) && (p >= c)) {
                d = c;
                c = p;
            } else if ((a > p) && (b > p) && (c > p) && (p >= d)) {
                d = p;
            } 

            num /= 10;
        } 

        return ((c + d) * 10) + a + b;
    } 
}
