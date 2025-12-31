class Solution {
    public int maximum69Number (int num) {
        int i = 0, a = 0, b = 0, c = 0, d = 0;

        while (num > 0) {
            if (i == 0) d = num % 10;
            else if (i == 1) c = num % 10;
            else if (i == 2) b = num % 10;
            else a = num % 10;

            num /= 10;

            i++;
        } 

        if ((a != 0) && (a != 9)) a = 9;
        else if ((b != 0) && (b != 9)) b = 9;
        else if ((c != 0) && (c != 9)) c = 9;
        else if ((d != 0) && (d != 9)) d = 9;

        return (a * 1000) + (b * 100) + (c * 10) + d;
    }
}
