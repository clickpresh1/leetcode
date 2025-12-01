class Solution {
    public int[] constructRectangle(int area) {
        int W = 1, L = area, maxW = 1;

        while (W * W <= area) {
            if (area % W == 0) {
                maxW = W;
                L = area / W;
            } 

            W += 1;
        }

        return new int[] {L, maxW};
    }
}
