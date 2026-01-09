class Solution {
    public int[] decrypt(int[] code, int k) {
        if (k > 0) return rotPos(code, k);
        else if (k < 0) return rotNeg(code, k);
        
        Arrays.fill(code, 0);

        return code;
    } 

    public static int[] rotPos(int[] a, int k) {
        int m = a.length;
        int[] arr = new int[m];

        k %= m;

        int currSum = posSum(a, k, 0);
        arr[0] = currSum;
        for (int i = 1; i < m; i++) {
            int q = (i + k) % m;
            currSum += - a[i] + a[q];
            arr[i] = currSum;
        }

        return arr;
    } 

    public static int[] rotNeg(int[] a, int k) {
        int m = a.length;
        int[] arr = new int[m];

        k = -1 * k;
        k %= m;

        int currSum = negSum(a, k, 0);
        arr[0] = currSum;
        int q = (m + 0 - k) % m;
        for (int i = 1; i < m; i++) {
            currSum += a[i - 1] - a[q];
            arr[i] = currSum;
            q = (m + i - k) % m;
        }

        return arr;
    } 

    public static int posSum(int[] a, int k, int x) {
        int m = a.length, y = (x + 1) % m, sum = 0;

        while (k > 0) {
            sum += a[y];

            y = (y + 1) % m;

            k--;
        } 

        return sum;
    } 

    public static int negSum(int[] a, int k, int x) {
        int m = a.length, y = (m + x - 1) % m, sum = 0;

        while (k > 0) {
            sum += a[y];

            y = (m + y - 1) % m;

            k--;
        } 

        return sum;
    } 
}
