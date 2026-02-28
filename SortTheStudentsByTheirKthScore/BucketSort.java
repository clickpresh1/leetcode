class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int m = score.length, n = score[0].length, mx = -1, mn = 100001;

        for (int i = 0; i < m; i++) {
            int item = score[i][k];

            if (item > mx) mx = item;
            if (item < mn) mn = item;
        } 
        
        int range = mx - mn + 1;
        int[][] bucks = new int[range][];
        for (int i = 0; i < m; i++) {
            int item = score[i][k];
            bucks[item - mn] = score[i];
        } 

        int q = 0;
        for (int i = mx; i >= mn; i--) {
            if (bucks[i - mn] == null) continue;

            score[q++] = bucks[i - mn];
        }

        return score;
    }
}
