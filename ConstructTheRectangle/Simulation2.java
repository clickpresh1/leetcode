class Solution {
    public int[] constructRectangle(int area) {
        int W = (int) Math.sqrt(area);

        while (area % W != 0) W -= 1; 

        return new int[] {area / W, W};
    }
}
