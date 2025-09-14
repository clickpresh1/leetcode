import java.math.BigInteger;
import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {
        String stringBeforeAdding1 = "";
        for (int i = 0; i < digits.length; i++) {
            stringBeforeAdding1 += String.valueOf(digits[i]);
        } 
        BigInteger bigInt = new BigInteger(stringBeforeAdding1);
        int one = 1;
        BigInteger oneInt = BigInteger.valueOf(one);
        BigInteger newBigInt = bigInt.add(oneInt);
        String stringAfterAdding1 = newBigInt.toString();
        System.out.println(stringAfterAdding1);
        int[] sAP = new int[stringAfterAdding1.length()];
        int[] sAN = new int[stringAfterAdding1.length() - 1];
        if (!(Character.getNumericValue(stringAfterAdding1.charAt(0)) < 0)) {
            for (int i = 0; i < stringAfterAdding1.length(); i++) {
                sAP[i] = Character.getNumericValue(stringAfterAdding1.charAt(i));
            }
        }

        else {
            for (int i = 1; i < stringAfterAdding1.length(); i++) {
                if (!(i - 1 == 0)) {
                    sAN[i - 1] = Character.getNumericValue(stringAfterAdding1.charAt(i));
                } else {
                    sAN[i - 1] = -1 * Character.getNumericValue(stringAfterAdding1.charAt(i));
                }
                
            } 
        }

        if (Character.getNumericValue(stringAfterAdding1.charAt(0)) < 0) {
            return sAN;
        } else {
            return sAP;
        }
    } 

}
