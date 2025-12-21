class Solution {
    public boolean validMountainArray(int[] arr) {
        int m = arr.length;

        if (m < 3) return false;

        if (arr[1] <= arr[0]) return false;

        int p = 1;
        boolean desc = false;

        for (int i = 2; i < m; i++) {
            if (!desc) {
                if (arr[i] > arr[p]) p = i;
                else if (arr[i] == arr[p]) return false;
                else desc = true;
            } else if (arr[i] >= arr[i - 1]) return false;
        } 

        return desc;
    }
}
