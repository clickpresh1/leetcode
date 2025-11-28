class Solution {
    public int arrangeCoins(int n) {
        long x = 0;
        long y = n;

        while (x <= y) {
            long mid = x + ((y - x) / 2);
            long area = ((mid + 1) * mid) / 2; 
            // area would have been (mid * mid) / 2 which is equivalent to (base * height) / 2, but since the diagonal that defines the triangle will cut slices of cells, the area is accurate when the base is extended by 1 unit: ((mid + 1) * mid) / 2, which is equivalent to ((base + 1) * height) / 2

            if (area == n) return (int) mid;
            else if (area > n) y = mid - 1;
            else x = mid + 1;
        } 

        return (int) y;
    }
}
