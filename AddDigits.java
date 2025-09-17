class Solution {
    public int addDigits(int num) {
        int returnValue = 0;
        if ((num > 9) && (num % 9 == 0)) {
            returnValue = 9;
        } else if ((num > 9) && (!(num % 9 == 0))) {
            returnValue = num % 9;
        } else if (num <= 9) {
            returnValue = num;
        }

        return returnValue;
    }
}
