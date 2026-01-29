class Solution {
    public int commonFactors(int a, int b) {
        int x = a, y = b, count = 1;

        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        for (int i = 2; i < x + 1; i++) {
            if ((a % i == 0) && (b % i == 0)) count++;
        } 

        return count;
    }
}
