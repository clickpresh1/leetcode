class Solution {
    public int findJudge(int n, int[][] trust) {
        int m = trust.length;

        if (m == 0) {
            if (n == 1) return n;
            else return -1;
        }

        boolean[] people1 = new boolean[n + 1];
        boolean[] people2 = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            people1[trust[i][0]] = true;
            people2[trust[i][1]] = true;
        } 

        for (int i = 1; i < n + 1; i++) {
            if (people2[i]) {
                if (people1[i]) people2[i] = false;
            }
        } 

        int judge = -1;
        for (int i = 1; i < n + 1; i++) {
            if (people2[i]) {
                judge = i;
                break;
            }
        } 

        if (judge == -1) return -1;

        int count = 0;
        for (int i = 0; i < m; i++) {
            if (judge == trust[i][1]) {
                count++;
            }
        }

        return (count == n -1) ? judge : -1;
    }
}
