class Solution {
    public int countEven(int num) {
        int x = 1, y = 0;

        while (x <= num) {
            if (check (x)) y++;

            x++;
        } 

        return y;
    } 

    public static boolean check(int n) {
        int k = n, sum = 0;

        while (k > 0) {
            sum += k % 10;
            k /= 10;
        } 

        if (sum % 2 == 0) return true;
        else return false;
    }
}
