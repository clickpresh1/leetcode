import java.util.HashMap;

class Solution {
    public static String fractionToDecimal(int numerator, int denominator) {
        StringBuilder sb = new StringBuilder();
        String result = "";
        String sign = "";
        if ((numerator < 0) && (denominator > 0)) {
            sign = "-";
        } else if ((numerator > 0) && (denominator < 0)) {
            sign = "-";
        } 

        if (numerator == 0) {
            return "0";
        } 

        long absNum = Math.abs(numerator);
        long absDen = Math.abs(denominator);
        
        long wholeNumber = absNum / absDen;
        sb.append(wholeNumber);
        result += wholeNumber;
        if (!(absNum % absDen == 0)) {
            sb.append(longDivision(absNum, absDen));
        } 

        result = sb.toString();

        result = sign + result.replaceAll("-", "");

        return result;
    } 

    public static String longDivision(long a, long b) {
        StringBuilder sb = new StringBuilder();
        sb.append(".");
        HashMap<Long, Integer> hashMap = new HashMap<>();
        long den = b;
        long rem = (a % den);
        while (rem != 0) {
            if (hashMap.containsKey(rem)) {
                int ind = hashMap.get(rem);
                sb.insert(ind, "(");
                sb.append(")");
                break;
            } 

            hashMap.put(rem, sb.length());
            rem = rem * 10;
            sb.append(rem / den);
            rem = rem % den;
        } 
    
        String s = sb.toString();

        return s;
    }

}
