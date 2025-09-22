class Solution {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int lastDigit = x % 10;
            int result2 = (result * 10) + lastDigit;
            if (((result2 - lastDigit) % 10) != 0) {
                result2 = 0;
            } 

            result = result2;

            x = x / 10;
        }

        return result;
    }
     
}
