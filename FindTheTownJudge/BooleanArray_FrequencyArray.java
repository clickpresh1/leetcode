class Solution {
    public int findJudge(int n, int[][] trust) {
        int m = trust.length;
        boolean[] people1 = new boolean[n + 1];
        int[] people2 = new int[n + 1];

        for (int i = 0; i < m; i++) {
            int a = trust[i][0], b = trust[i][1];
            
            people1[a] = true; people2[b]++;
        } 

        int judge = -1;
        for (int i = 1; i < n + 1; i++) {
            if ((people2[i] == n - 1) && (!people1[i])) {
                judge = i; break;
            } 
        } 

        return judge;
    }
}
