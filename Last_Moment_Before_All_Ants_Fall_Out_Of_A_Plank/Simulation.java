class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int m = n, mx = 0;

        for (int item : left) mx = Math.max(item, mx);

        for (int item : right) mx = Math.max(m - item, mx);

        return mx;
    }
}
