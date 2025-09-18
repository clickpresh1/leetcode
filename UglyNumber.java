class Solution {
    public boolean isUgly(int n) {
        boolean isUgly = false;

        if (n <= 0) {
            isUgly = false;
        } else if (n == 1) {
            isUgly = true;
        } else {
            while (true) {
                if ((!(n % 2 == 0)) && (!(n % 3 == 0)) && (!(n % 5 == 0))) {
                    isUgly = false;
                    break;
                } 
                if (n % 2 == 0) {
                    n = (n / 2);
                } else if (n % 3 == 0) {
                    n = (n / 3);
                } else if (n % 5 == 0) {
                    n = (n / 5);
                } 

                if (n == 1) {
                    isUgly = true;
                    break;
                }
            }
        }
        
        return isUgly;
    } 


    
}
