class Solution {
    public int computeArea(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2) {
        int area1 = Math.abs((ax1 - ax2) * (ay1 - ay2));
        int area2 = Math.abs((bx1 - bx2) * (by1 - by2));

        int L = Math.max(ax1, bx1);
        int R = Math.min(ax2, bx2);
        int T = Math.min(ay2, by2);
        int B = Math.max(ay1, by1);

        if ((R - L < 0) || (T - B < 0)) {
            return area1 + area2;
        } else {
            return area1 + area2 - ((R - L) * (T - B));
        }
    }
}
