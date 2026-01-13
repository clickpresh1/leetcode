class Solution {
    public int numberOfMatches(int n) {
        int m = n, count = 0;

        while (m > 1) {
            if (m % 2 == 0) {
                count += m / 2;
                m /= 2;
            } else {
                count += --m / 2;
                m /= 2;
                m++;
            } 
        } 

        return count;
    }
}
