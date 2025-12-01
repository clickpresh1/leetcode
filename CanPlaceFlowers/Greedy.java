class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c = 0, C = 0, m = flowerbed.length;

        if (n == 0) return true;

        if ((m == 1) && (n == 1)) {
            if (flowerbed[0] == 1) return false;
            else return true;
        }

        int left = 0, right = flowerbed[1];

        for (int i = 0; i < m - 1; i++) {
            right = flowerbed[i + 1];
            if ((flowerbed[i] == 0) && (left == 0) && (right == 0)) {
                C += 1;
                left = 1;
            } else left = flowerbed[i];

        } 

        if ((flowerbed[m - 1] == 0) && (left == 0) && (right == 0)) C += 1;

        return C >= n;
    }
}
