class Solution {
    public int heightChecker(int[] heights) {
        int m = heights.length, count = 0;
        int[] exp = new int[m];

        for (int i = 0; i < m; i++) exp[i] = heights[i];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m - 1 - i; j++) {
                if (exp[j] > exp[j + 1]) {
                    int temp = exp[j];
                    exp[j] = exp[j + 1];
                    exp[j + 1] = temp;
                } 
            } 

            if (exp[m - 1 - i] != heights[m - 1 - i]) count++;
        }

        return count;
    }
}
