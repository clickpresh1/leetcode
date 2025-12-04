class Solution {
    public int alternateDigitSum(int n) {
        int count = 0; 
        int signEven = 1, signOdd = -1;
        int sumEven = 0, sumOdd = 0;

        while (n > 0) {
            sumEven += ((n % 10) * (signEven *= -1));

            sumOdd += ((n % 10) * (signOdd *= -1));

            count++;
            n /= 10;
        } 

        if (count % 2 == 0) return sumEven;
        else return sumOdd; 
    }
}
