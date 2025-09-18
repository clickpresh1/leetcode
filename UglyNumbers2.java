class Solution {
    public int nthUglyNumber(int n) {
        int[] arrUgly = new int[n];

        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        
        arrUgly[0] = 1;

        for (int i = 1; i <= n - 1; i++) {
            int next2 = arrUgly[i2] * 2;
            int next3 = arrUgly[i3] * 3;
            int next5 = arrUgly[i5] * 5;

            int minIn = Math.min(next2, next3);
            int minOut = Math.min(minIn, next5);  

            arrUgly[i] = minOut;

            if (next2 == minOut) {
                i2 += 1;
            } 
            if (next3 == minOut) {
                i3 += 1;
            } 
            if (next5 == minOut) {
                i5 += 1;
            } 
        } 

       return  arrUgly[n - 1];

    } 
       
}
