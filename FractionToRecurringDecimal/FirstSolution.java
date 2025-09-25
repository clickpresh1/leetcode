import java.util.HashMap;

class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
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
        if (!(absNum % absDen == 0)) {
            sb.append(".");
            HashMap<Long, Integer> hashMap = new HashMap<>();
            long rem = (absNum % absDen);
            while (rem != 0) {
                if (hashMap.containsKey(rem)) {
                    int ind = hashMap.get(rem);
                    sb.insert(ind, "(");
                    sb.append(")");
                    break;
                } 

                hashMap.put(rem, sb.length());
                rem = rem * 10;
                sb.append(rem / absDen);
                rem = rem % absDen;
            } 
        } 

        result = sign + sb.toString().replaceAll("-", "");

        return result;
    } 
}
