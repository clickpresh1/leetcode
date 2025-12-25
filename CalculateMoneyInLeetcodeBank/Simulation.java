class Solution {
    public int totalMoney(int n) {
        int i = 1, j = 1, k = 1, monday = 1, sum = 0;

        while (i <= n) {
            if (k == 1) j = monday++;
            else j++;

            sum += j;

            if (k == 7) {
                j = 0;
                k = 0;
            } 

            i++;
            k++;
        }

        return sum;
    }
}
