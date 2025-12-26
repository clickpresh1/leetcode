class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int m = dominoes.length, count = 0;

        int[] freq = new int[101];

        for (int i = 0; i < m; i++) {
            int a = dominoes[i][0] - 1, b = dominoes[i][1] - 1;
            
            if (b > a) count += freq[(a * 10) + b]++;
            else count += freq[(b * 10) + a]++;
        }

        return count;
    } 
}
