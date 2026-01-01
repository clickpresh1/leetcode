class Solution {
    public boolean checkIfExist(int[] arr) {
        int m = arr.length;
        int[] freq = new int[2001];

        for (int i = 0; i < m; i++) {
            freq[arr[i] + 1000]++;
        } 

        for (int i = 0; i < 2001; i++) {
            int j = i - 1000;

            if ((j == 0) && freq[i] > 1) return true;
            if (j == 0) {
                if (freq[i] > 1) return true;
                else continue;
            }

            if (freq[i] > 0) {
                if ((j % 2 == 0) && (freq[(j / 2) + 1000] > 0)) {
                    return true;
                }
            } 
        }

        return false;
    }
}
