class Solution {
    public int binaryGap(int n) {
        int max = 0, x = 0, i = 0;
        boolean boo = false;
        
        while (n > 0) {
            if (boo) {
                if ((n & 1) == 1) {
                    if ((i - x) > max) max = i - x;
                    x = i;
                } 
            } else {
                if ((n & 1) == 1) {
                    x = i;
                    boo = true;
                }
            }
            
            n >>= 1;
            i++;
        } 

        return max;
    }
}
