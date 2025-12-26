class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] freq = new int[1001];
        int m = arr1.length, n = arr2.length;

        for (int i = 0; i < m; i++) freq[arr1[i]]++;

        int[] res = new int[m];
        int j = 0;

        for (int i = 0; i < n; i++) {
            while (freq[arr2[i]] > 0) {
                res[j++] = arr2[i];

                freq[arr2[i]]--;
            } 
        } 

        for (int i = 0; i < 1001; i++) {
            if (freq[i] > 0) {
                while (freq[i] > 0) {
                    res[j++] = i;

                    freq[i]--;
                }
            }
        }

        return res;
    }
}
