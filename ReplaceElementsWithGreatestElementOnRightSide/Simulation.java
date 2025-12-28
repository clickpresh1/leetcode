class Solution {
    public int[] replaceElements(int[] arr) {
        int m = arr.length;
        int max = arr[m - 1], prev = arr[m - 1];

        for (int i = m - 2; i >= 0; i--) {
            if (prev > max) max = prev;

            prev = arr[i];

            arr[i] = max;
        } 

        arr[m - 1] = -1;

        return arr;
    } 
}
