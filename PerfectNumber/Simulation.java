class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num == 1) return false;

        int d = 1, sum = d; 
        d++;

        while (d * d <= num) {
            if (num % d == 0) sum += d + (num / d);
            d++;
        }

        return num == sum;
    } 
}
