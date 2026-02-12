class Solution {
    public int differenceOfSums(int n, int m) {
        int q = n / m;
        
        int sum2 = ((q * (q + 1)) / 2) * m;

        int sum1 = (n * (n + 1)) / 2 - sum2;

        return sum1 - sum2;
    }
}
