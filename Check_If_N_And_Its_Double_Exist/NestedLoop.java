class Solution {
    public boolean checkIfExist(int[] arr) {
        int m = arr.length;

        for (int i = 0; i < m - 1; i++) {
            for (int j = i + 1; j < m; j++) {
                if ((arr[i] == (2 * arr[j])) || ((arr[i] * 2) == arr[j])) {
                    return true;
                }
            }
        } 

        return false;
    }
}
