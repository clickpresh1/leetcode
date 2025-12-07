class Solution {
    public String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        int m = arr.length, n = 0;

        while (n < m) {
            if (m - n < k) k = m - n;

            int x = n;

            reverse(arr, x, k);

            n += (2 * k);
        } 

        return new String(arr);
    } 

    public static void reverse(char[] arr, int x, int k) {
        for (int i = x, j = 0; i < (x + (k / 2)); i++) {
            char temp = arr[i];
            arr[i] = arr[k + x - j - 1];
            arr[k + x - j - 1] = temp;
            j++;
        } 
    }
}
