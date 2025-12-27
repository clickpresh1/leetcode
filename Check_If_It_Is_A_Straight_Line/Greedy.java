class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int x1 = coordinates[0][0], y1 = coordinates[0][1];
        int x2 = coordinates[1][0], y2 = coordinates[1][1];
        int m = coordinates.length;

        if (m == 2) return true;

        for (int i = 2; i < m; i++) {
            int x3 = coordinates[i][0], y3 = coordinates[i][1];

            int a = (x1 * (y2 - y3)) + (x2 * (y3 - y1)) + (x3 * (y1 - y2));
            if (a != 0) return false;
        } 

        return true;
    } 
}
