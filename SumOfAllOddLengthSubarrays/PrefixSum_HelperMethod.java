class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int m = arr.length, globalSum = 0, n = (m % 2 == 1) ? m : (m - 1);

        int x = 1;

        while (x <= n) {
            globalSum += pref(arr, x);

            x += 2;
        } 

        return globalSum;
    } 

    public static int pref(int[] a, int x) {
        int m = a.length, r = 0, currSum = 0, sum = 0;

        while (r < x) currSum += a[r++];

        sum += currSum;

        for (int i = 1; i < m - x + 1; i++) {
            currSum += - a[i - 1] + a[x + i - 1];

            sum += currSum;
        } 

        return sum;
    }
}
