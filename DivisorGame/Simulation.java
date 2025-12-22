class Solution {
    public boolean divisorGame(int n) {
        int i = 0;

        while (n > 1) {
            n = num(n);

            i++;
        } 

        return (i % 2 != 0) && (n == 1);
    } 

    public static int num(int a) {
        int k = 1;

        while (k < a) {
            if (a % k == 0) break;

            k++;
        } 

        return a - k;
    }
}
