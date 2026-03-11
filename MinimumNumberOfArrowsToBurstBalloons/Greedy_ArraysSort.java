class Solution {
    public int findMinArrowShots(int[][] points) {
        int m = points.length;

        Arrays.sort(points, (x, y) -> {
            return (x[0] != y[0]) ? Integer.compare(x[0], y[0]) : Integer.compare(x[1], y[1]);
        });

        int[][] arr = new int[m][2];
        int k = 0;
        arr[k++] = points[0];
        int a = points[0][0], b = points[0][1];
        for (int i = 1; i < m; i++) {
            int c = points[i][0], d = points[i][1];

            if (b < c) {
                arr[k][0] = c; arr[k++][1] = d; 

                a = c; b = d;
            } else {
                arr[--k][0] = c;
                
                if (b <= d) arr[k][1] = b;
                else arr[k][1] = d;

                a = arr[k][0]; b = arr[k][1];
                k++;
            } 
        }

        return k;
    } 
}
