class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int m = intervals.length, cnt = 0;

        Arrays.sort(intervals, (x, y) -> {
            if (x[0] != y[0]) return Integer.compare(x[0], y[0]);
            else return Integer.compare(x[1], y[1]);
        }); 

        int a = intervals[0][0], b = intervals[0][1];
        for (int i = 1; i < m; i++) {
            int c = intervals[i][0], d = intervals[i][1];

            if (b > c) {
                if (a < c) a = c;

                if (b > d) b = d;

                cnt++;
            } else {
                a = c; b = d;
            } 
        } 

        return cnt;
    }
}
