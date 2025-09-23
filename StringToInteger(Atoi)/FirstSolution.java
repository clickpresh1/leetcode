class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        long result = 0;
        int sign = 1;
        if (s.isEmpty() || s.length() == 0) {
           result = 0;
        } 

        long digit = 0;
        long resultWithSign = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ((i == 0) && (s.charAt(0) == '-')) {
                sign = -1;
                continue;
            } 
            if ((i == 0) && (s.charAt(0) == '+')) {
                continue;
            } 

            if (!(Character.isDigit(s.charAt(i)))) {
                break;
            } 

            digit = Character.getNumericValue(s.charAt(i));
            
            sb.append(digit);
  
            result = Long.parseLong(sb.toString());

            resultWithSign = result * sign;

            if (resultWithSign < Integer.MIN_VALUE) {
                resultWithSign = Integer.MIN_VALUE;
                break;
            } 
            if (resultWithSign > Integer.MAX_VALUE) {
                resultWithSign = Integer.MAX_VALUE;
                break;
            } 
            
        }  

        result = resultWithSign;  

        return (int) result;
    } 
}
