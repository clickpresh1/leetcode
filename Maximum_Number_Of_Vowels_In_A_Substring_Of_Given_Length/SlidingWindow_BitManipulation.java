class Solution {
    public int maxVowels(String s, int k) {
        int m = s.length(), mx = 0;
        char[] arr = s.toCharArray();

        int b = (1 << 0) | (1 << 4) | (1 << 8) | (1 << 14) | (1 << 20);

        for (int i = 0; i < k; i++) {
            if ((b & (1 << (arr[i] - 'a'))) != 0) mx++;
        } 

        if (mx == k) return k;

        int runningCnt = mx;

        for (int i = k; i < m; i++) {
            if ((b & (1 << (arr[i - k] - 'a'))) != 0) --runningCnt;

            if ((b & (1 << (arr[i] - 'a'))) != 0) ++runningCnt;

            if (runningCnt > mx) mx = runningCnt;

            if (mx == k) return k;
        } 

        return mx;
    } 
}
