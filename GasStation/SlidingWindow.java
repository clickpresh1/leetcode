class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int m = gas.length;

        for (int i = 0; i < m; i++) {
            int rem = gas[i] - cost[i];
            if (rem < 0) continue;

            int j = i + 1;
            while (j % m != i) {
                int k = j % m, r = rem + gas[k] - cost[k];

                if (r >= 0) {
                    rem = r;
                    j++;
                } else break;
            } 

            if (j % m == i) return i;

            if (j > i) i = j;

            if (i >= m) break;
        } 

        return -1;
    }
}
