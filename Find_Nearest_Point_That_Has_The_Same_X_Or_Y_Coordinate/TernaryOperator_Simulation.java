class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int m = points.length, min = 10000, minIndx = -1, c = 10000;

        for (int i = 0; i < m; i++) {
            int a = points[i][0], b = points[i][1];

            if ((a == x) || (b == y)) {
                c = (a == x) ? ((b == y) ? 0 : ((b > y) ? (b - y) : (y - b))) : ((b == y) ? ((a > x) ? (a - x) : (x - a)) : c);
            }

            if (c < min) {min = c; minIndx = i;}
        } 

        return minIndx;
    }
}
