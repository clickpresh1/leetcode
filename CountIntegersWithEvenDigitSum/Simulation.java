class Solution {
    public int countEven(int num) {
        int x = 1, y = 0;

        while (x <= num) {
            int sum = 0, k = x;

            while (k > 0) {
                sum += k % 10;
                k /= 10;
            } 

            if (sum % 2 == 0) y++;

            x++;
        } 

        return y;
    }
}
