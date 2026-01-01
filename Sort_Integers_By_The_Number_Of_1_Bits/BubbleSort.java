class Solution {
    public int[] sortByBits(int[] arr) {
        int m = arr.length;
        int[] f = new int[m];

        for (int i = 0; i < m; i++) f[i] = bitCount(arr[i]);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m - 1 - i; j++) {
                if ((f[j] > f[j + 1]) || ((f[j] == f[j + 1]) && (arr[j] > arr[j + 1]))) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    temp = f[j];
                    f[j] = f[j + 1];
                    f[j + 1] = temp;

                }
            } 
        } 

        return arr;       
    } 

    public static int bitCount(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) count++;

            n >>= 1;
        } 

        return count;
    }
}
