class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int lL = Integer.MAX_VALUE, bB = Integer.MAX_VALUE;
        int rL = 0, tB = 0, lR = 0, bT = 0, rR = 0, tT = 0;

        if (rec1[0] < lL) lL = rec1[0];
        if (rec2[0] < lL) lL = rec2[0];

        if (lL == rec1[0]) {
            rL = rec1[2];
            lR = rec2[0];
            rR = rec2[2];
        } else {
            rL = rec2[2];
            lR = rec1[0];
            rR = rec1[2];
        } 

        if (rec1[1] < bB) bB = rec1[1];
        if (rec2[1] < bB) bB = rec2[1];

        if (bB == rec1[1]) {
            tB = rec1[3];
            bT = rec2[1];
            tT = rec2[3];
        } else {
            tB = rec2[3];
            bT = rec1[1];
            tT = rec1[3];
        }

        return (rL <= lR) || (tB <= bT) ? false : true;
    } 
}
