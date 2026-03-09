class Solution {
    public int integerReplacement(int n) {
        int cnt = 0;

        if (n == Integer.MAX_VALUE) n--;

        while (n > 1) {
            if ((n & 1) == 0) n >>= 1;
            else {
                if (n == 3) n--;
                else if (((n >> 1) & 1) == 1) n++;
                else n--; 
            } 

            cnt++;
        } 

        return cnt;
    }
}
