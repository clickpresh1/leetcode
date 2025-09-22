class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        long result = 0;
        int sign = 1;
        int i = 0;

        if (s.length() == 0) {
            return 0;
        } 

        if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(0) == '+') {
            i++;
        }

        while (i < s.length()) {
            if (!(Character.isDigit(s.charAt(i)))) {
                break;
            } 

            int digit = Character.getNumericValue(s.charAt(i));
            
            result = (result * 10) + digit;

            if (result * sign > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            } 
            if (result * sign < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            } 

            i++;
        } 
    
        return (int) (result * sign);
        
    } 
}
