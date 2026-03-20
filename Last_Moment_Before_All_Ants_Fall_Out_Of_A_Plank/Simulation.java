class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int m = n, mx = 0;

        for (int item : left) {
            int time = item - 0;

            if (time > mx) mx = time;
        } 

        for (int item : right) {
            int time = m - item;

            if (time > mx) mx = time;
        } 

        return mx;
    }
}
