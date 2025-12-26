class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int m = dominoes.length, count = 0;
        int[][] freq = new int[9][9];

        for (int i = 0; i < m; i++) {
            int a = dominoes[i][0] - 1;
            int b = dominoes[i][1] - 1;

            if (b > a) count += freq[a][b]++;
            else count += freq[b][a]++;
        } 

        return count;
    } 
}
