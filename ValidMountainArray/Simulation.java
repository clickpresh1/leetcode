class Solution {
    public boolean validMountainArray(int[] arr) {
        int m = arr.length;

        if (m < 3) return false;

        if (arr[1] <= arr[0]) return false;

        int i = 2;
        while (i < m) {
            if (arr[i] == arr[i - 1]) return false;
            else if (arr[i] < arr[i - 1]) break;

            i++;
        } 

        if (i == m) return false;

        while (i < m) {
            if (arr[i] >= arr[i - 1]) return false;

            i++;
        } 

        return true;
    }
}
