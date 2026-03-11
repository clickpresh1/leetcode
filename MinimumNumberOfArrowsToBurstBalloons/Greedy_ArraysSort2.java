class Solution {
    public int findMinArrowShots(int[][] points) {
        int m = points.length, cnt = 0;

        Arrays.sort(points, (x, y) -> {
            return (x[0] != y[0]) ? Integer.compare(x[0], y[0]) : Integer.compare(x[1], y[1]);
        });

        int a = points[0][0], b = points[0][1];
        cnt++;
        for (int i = 1; i < m; i++) {
            int c = points[i][0], d = points[i][1];

            if (b < c) {
                a = c; b = d;
                
                cnt++;
            } else {
                a = c;

                if (b > d) b = d; 
            } 
        }

        return cnt;
    } 
}
