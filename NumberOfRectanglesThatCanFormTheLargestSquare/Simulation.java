class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int max = 0, count = 0;

        for (int[] rec : rectangles) {
            int len = (rec[0] <= rec[1]) ? rec[0] : rec[1];

            if (len > max) {
                max = len;
                count = 1;
            } else if (len == max) count++;
        } 

        return count;
    }
}
