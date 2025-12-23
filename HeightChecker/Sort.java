class Solution {
    public int heightChecker(int[] heights) {
        int m = heights.length, count = 0;
        int[] exp = new int[m];

        for (int i = 0; i < m; i++) exp[i] = heights[i];

        Arrays.sort(exp);

        for (int i = 0; i < m; i++) 
            if (exp[i] != heights[i]) count++;

        return count;
    }
}
