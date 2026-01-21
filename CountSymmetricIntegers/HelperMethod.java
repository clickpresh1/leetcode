class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        int i = low;
        while (i <= high) {
            if ((i >= 1) && (i <= 9)) {
                i = 10;
            } else if ((i >= 100) && (i <= 999)) {
                i = 1000;
            } else {
                if (check(i)) count++;

                i++;
            }
        }

        return count;
    } 

    public static boolean check(int a) {
        if ((a >= 10) && (a <= 99)) {
            return (a % 10) == (a / 10);
        } else if (a == 10000) return false;
        else {
            return ((a % 10) + ((a / 10) % 10)) == (((a / 100) % 10) + ((a / 1000) % 10));
        }
    }

}
