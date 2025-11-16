class Solution {
    public int countPrimes(int n) {
        if ((n == 1) || (n == 0)) return 0;

        int count = n - 2;

        boolean[] boos = new boolean[n + 1];

        for (int i = 2; i < n; i++) {
            boos[i] = true;
        } 

        for (int i = 2; (i * i) <= n; i++) {
            if (boos[i] == true) {
                for (int j = (i * i); j <= n; j += i) {
                    if (boos[j]) {
                        boos[j] = false;
                        count -= 1;
                    }
                }
            } 
        } 

        return count;
    }
}
