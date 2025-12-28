class Solution {
    public int findSpecialInteger(int[] arr) {
        int m = arr.length, k = m / 4, count = 1;

        for (int i = 1; i < m; i++) {
            if (arr[i] == arr[i - 1]) count++;
            else count = 1;

            if (count > k) return arr[i];
        } 

        return arr[0];
    }
}
