class Solution {
    public int[] sumZero(int n) {
        int[] arr = new int[n];

        int i = 0, j = 1;
        while ((i < n - 1) && (i < n)) {
            arr[i++] = j;
            arr[i++] = -1 * j++;
        } 

        return arr;
    }
}
