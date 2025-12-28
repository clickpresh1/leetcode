class Solution {
    public int[] replaceElements(int[] arr) {
        int m = arr.length, x = pick(arr, 0);

        for (int i = 0; i < m - 1; i++) {
            if (arr[i] == arr[x]) x = pick(arr, i);

            arr[i] = arr[x];
        } 

        arr[m - 1] = -1;

        return arr;
    } 

    public static int pick(int[] a, int b) {
        int maxIndx = b + 1;
        for (int i = b + 1; i < a.length; i++) {
            if (a[i] > a[maxIndx]) maxIndx = i;
        } 

        return maxIndx;
    }
}
