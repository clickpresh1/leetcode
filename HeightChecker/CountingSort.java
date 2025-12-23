class Solution {
    public int heightChecker(int[] heights) {
        int m = heights.length, count = 0;
        int[] exp = new int[m], freq = new int[101];

        for (int i = 0; i < m; i++) freq[heights[i]]++;

        for (int i = 1, j = 0; i < 101; i++) {
            while (freq[i] > 0) {
                exp[j++] = i;
                freq[i]--;
            }
        }

        for (int i = 0; i < m; i++) if (exp[i] != heights[i]) count++;

        return count;
    }
}
