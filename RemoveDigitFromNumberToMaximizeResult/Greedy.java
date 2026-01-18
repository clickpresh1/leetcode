class Solution {
    public String removeDigit(String number, char digit) {
        int m = number.length(), newestIndx = 0;

        for (int i = 0; i < m - 1; i++) {
            if (number.charAt(i) == digit) {
                newestIndx = i;
                if (number.charAt(i + 1) > digit) {
                    return number.substring(0, i) + number.substring(i + 1, m);
                }
            }
        } 

        if (number.charAt(m - 1) == digit) {
            return number.substring(0, m - 1); 
        }

        return number.substring(0, newestIndx) + number.substring(newestIndx + 1, m);
    }
}
