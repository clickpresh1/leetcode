// This solution uses long integers (64-bit integers), so it violates one of the requirements stated by Leetcode. But the solution was accepted still


import java.util.Arrays;

class Solution {
    public static int reverse(int x) {
        long newStringInt = 0;
        if ((x <= Integer.MAX_VALUE) && (x > Integer.MIN_VALUE)) {
            int xAbs = Math.abs(x);
            String xString = String.valueOf(xAbs);
            char[] xArr = xString.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < xArr.length; i++) {
                if (i < xArr.length / 2) {
                    char helper = xArr[i];
                    xArr[i] = xArr[xArr.length - 1 - i];
                    xArr[xArr.length - 1 - i] = helper;
                } 
    
                sb.append(String.valueOf(xArr[i]));
            } 
    
            String newString = sb.toString();
            newStringInt = Long.valueOf(newString);
    
            if (x < 0) {
                newStringInt = (-1 * newStringInt);
            } 
            
            if ((newStringInt >= Integer.MAX_VALUE) || (newStringInt <= Integer.MIN_VALUE)) {
                newStringInt = 0;
            }
        }

        return (int) newStringInt;
    } 
    
}
