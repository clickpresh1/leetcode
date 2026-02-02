class Solution {
    public int numberOfChild(int n, int k) {
        int m = n - 1;

        k %= m * 2;

        return (k > m) ? m - (k - m) : k;
    }
}
