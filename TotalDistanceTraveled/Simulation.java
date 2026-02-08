class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int sum = 0, k = mainTank / 5, q = mainTank % 5;

        sum += 50 * k;

        int mn = Math.min(additionalTank, k), y = additionalTank - mn;

        q += mn; 
        while (q >= 5) {
            int a = q / 5, b = q % 5;
            sum += a * 50;

            if (y > 0) {
                int mn2 = Math.min(y, a);
                b += mn2;
                y -= mn2;
            } 

            q = b;
        } 

        sum += 10 * q;

        return sum;
    } 
}
