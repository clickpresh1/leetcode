class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1) return true;
        int x = 2;
        int y = (num / 2) + 1; // would normally have y = num here (or y = num - 1), but since the square root cannot be greater than the half of the number, + 1, i decided to use y = num / 2

        while (x <= y) {
            int mid = x + ((y - x) / 2);

            if ((mid * mid == num) && (num % mid == 0)) return true;
            else if (mid > (num / mid)) y = mid - 1;
            else x = mid + 1;
        } 

        return false;
    }
}
