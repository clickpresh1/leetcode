class Solution {
    public int findLucky(int[] arr) {
        int m = arr.length;
        int[] freq = new int[501];

        for (int i = 0; i < m; i++) freq[arr[i]]++;

        for (int i = 500; i >= 1; i--) if (freq[i] == i) return i;

        return -1;
    }
}
