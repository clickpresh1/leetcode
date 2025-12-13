class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;

        for (int i = left; i <= right; i++) if (isPrime(countSetBits(i))) count++;

        return count;
    } 

    public static int countSetBits(int n) {
        int count = 0;

        while (n > 0) {
            n &= (n - 1);
            count++;
        } 

        return count;
    } 

    public static boolean isPrime(int n) {
        if (n <= 1) return false;

        if (n == 2) return true;

        if (n % 2 == 0) return false;

        for (int i = 3; i * i <= n; i += 2) if (n % i == 0) return false;

        return true;
    }
}
