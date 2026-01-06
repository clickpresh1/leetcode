class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int a = ((p2[1] - p1[1]) * (p2[1] - p1[1])) + ((p2[0] - p1[0]) * (p2[0] - p1[0]));
        
        int b = ((p3[1] - p1[1]) * (p3[1] - p1[1])) + ((p3[0] - p1[0]) * (p3[0] - p1[0]));

        int c = ((p4[1] - p1[1]) * (p4[1] - p1[1])) + ((p4[0] - p1[0]) * (p4[0] - p1[0]));

        int d = ((p3[1] - p2[1]) * (p3[1] - p2[1])) + ((p3[0] - p2[0]) * (p3[0] - p2[0]));

        int e = ((p4[1] - p2[1]) * (p4[1] - p2[1])) + ((p4[0] - p2[0]) * (p4[0] - p2[0])); 

        int f = ((p4[1] - p3[1]) * (p4[1] - p3[1])) + ((p4[0] - p3[0]) * (p4[0] - p3[0])); 

        if ((a == 0) || (b == 0) || (c == 0) || (d == 0) || (e == 0) || (f == 0)) return false; 


        int[] res = new int[] {a, b, c, d, e, f};

        int first = res[0];
        int second = Integer.MIN_VALUE;
        boolean foundSecond = false;

        for (int i = 0; i < 6; i++) {
            if (res[i] == first) continue;

            if (!foundSecond) {
                second = res[i];
                foundSecond = true;
            } else {
                if (res[i] != second) return false;
            }
        } 

        return foundSecond;
    } 
}
