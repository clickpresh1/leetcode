class Solution {
    public int countDigits(int num) {
        int k = num, count = 0;
        
        while (k != 0) {
            if (num % (k % 10) == 0) count++;
            k /= 10;
        } 

        return count;
    }
}
