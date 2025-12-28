class Solution {
    public int subtractProductAndSum(int n) {
        int prod = 1, sum = 0;

        while (n != 0) {
            int q = n % 10;
            prod *= q;
            sum += q;

            n /= 10;
        } 

        return prod - sum;
    }
}
