class Solution {
    public int pivotInteger(int n) {
        if (n == 1) return 1;

        int sum = (n * (n + 1)) / 2;
        int prefixSum = 0;

        for (int i = 1; i < n; i++) {
            int diff = sum - prefixSum;

            prefixSum += i;

            if (prefixSum == diff) return i;
        } 

        return -1;
    }
}
