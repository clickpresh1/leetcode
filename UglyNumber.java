class Solution {
    public boolean isUgly(int n) {
        boolean isUgly = false;
        if (n <= 0) {
            isUgly = false;
        }
        if ((n >= 1) && (n <= 5)) {
            isUgly = true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if ((!((i % 2 == 0) || (i % 3 == 0) || (i % 5 == 0)))) {
                    isUgly = false;
                    break;
                } else if ((((((n / i) % 2) != 0) && (((n / i) % 3) != 0) && (((n / i) % 5) != 0)))  && ((i % 2 == 0) || (i % 3 == 0) || (i % 5 == 0))) {
                    isUgly = false;
                    break;
                } else if ((!((((n / i) % 2) != 0) && (((n / i) % 3) != 0) && (((n / i) % 5) != 0)))  && ((i % 2 == 0) || (i % 3 == 0) || (i % 5 == 0))) {
                    System.out.println(i);
                    isUgly = true;
                } 
            }
        }

        return isUgly;
    } 

    
}
