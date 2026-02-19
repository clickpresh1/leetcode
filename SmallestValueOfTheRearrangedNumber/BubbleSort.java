class Solution {
    public long smallestNumber(long num) {
        int[] arr = new int[16];
        long x = num;
        int k = 0;

        while (x != 0) {
            arr[k++] = (int) (x % 10);

            x /= 10;
        } 

        for (int i = 0; i < k; i++) {
            for (int j = k - 1; j > i; j--) {
                int u = arr[j - 1], v = arr[j];

                if (v < u) {
                    int temp = v;
                    arr[j] = u;
                    arr[j - 1] = temp;
                } 
            } 
        } 

        if (arr[0] == 0) {
            for (int i = 1; i < k; i++) {
                if (arr[i] != 0) {
                    arr[0] = arr[i];
                    arr[i] = 0;
                    break;
                }
            }
        }
        
        long res = 0;
        for (int i = 0; i < k; i++) res = (res * 10) + arr[i];

        return res;
    }
}
