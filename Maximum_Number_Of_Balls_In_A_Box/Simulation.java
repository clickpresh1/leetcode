class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] sumFreq = new int[46];
        int max = 1;

        int a = lowLimit, b = 0;
        while (a > 0) {
            b += a % 10;
            a /= 10;
        } 

        sumFreq[b]++;

        for (int i = lowLimit + 1; i < highLimit + 1; i++) {
            if (i % 10 != 0) b++;
            else {
                a = i;
                b = 0;
                while (a > 0) {
                    b += a % 10;
                    a /= 10;
                } 
            } 

            sumFreq[b]++;

            if (sumFreq[b] > max) max = sumFreq[b];
        } 

        return max;
    }
}
