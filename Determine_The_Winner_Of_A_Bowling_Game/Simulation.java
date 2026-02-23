class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int m = player1.length, score1 = 0, score2 = 0;
        int f1 = -1, f2 = -1, g1 = -1, g2 = -1;

        for (int i = 0; i < m; i++) {
            int f = player1[i], g = player2[i];
            
            score1 += (f1 == 10) || (f2 == 10) ? 2 * f : f;

            score2 += (g1 == 10) || (g2 == 10) ? 2 * g : g;

            f2 = f1; f1 = f;
            g2 = g1; g1 = g;
        }

        return (score1 > score2) ? 1 : (score1 == score2) ? 0 : 2;
    }
}
