class Solution {
    public int totalMoney(int n) {
        int weeks = n / 7, day = n % 7, sum = 0;

        for (int i = 0, j = 0; i < weeks; i++) sum += 28 + (7 * j++);

        int k = weeks, q = 1;

        while (q <= day) {
            sum += ++k;

            q++;
        } 

        return sum;
    }
}
