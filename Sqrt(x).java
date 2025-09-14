class Solution {
    public int mySqrt(int x) {
        long value = 0;
        int maxInt = Integer.MAX_VALUE;
        long ind = maxInt;
        if (x == 1) {
            value = 1;
        } else if (x > 1) {
            for (long i = 1; i < ind; i++) {
                if ((i * i <= x) && (((i + 1) * (i + 1)) > x)) {
                    value = i;
                    break;
                }
        } 
        }
         
        int valInt = (int) value;
        return valInt;
    } 

}
