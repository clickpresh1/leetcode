class Solution {
    public int minimumLevels(int[] possible) {
        int m = possible.length, sum = 0;

        for (int item : possible) sum += item == 0 ? -1 : 1;

        int aliceScore = 0;
        for (int i = 0; i < m - 1; i++) {
            aliceScore += (possible[i] == 0) ? -1 : 1;

            int bobScore = sum - aliceScore;

            if (aliceScore > bobScore) return ++i;
        }

        return -1;
    }
}
