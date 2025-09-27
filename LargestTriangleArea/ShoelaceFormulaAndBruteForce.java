class Solution {
    public double largestTriangleArea(int[][] points) {
        double area = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                for (int k = 0; k < points.length; k++) {
                    if ((i != j) && (i != k) && (j != k)) {
                        area = Math.max(area, areaOfTriangle(points[i], points[j], points[k]));
                    }
                }
            }
        }

        return area;
    } 

    public static double areaOfTriangle(int[] p1, int[] p2, int[] p3) {
        
        // return Shoelace formula
        return 0.5 * Math.abs((p1[0] * (p2[1] - p3[1])) + (p2[0] * (p3[1] - p1[1])) + (p3[0] * (p1[1] - p2[1])));
    } 
}
