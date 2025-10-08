class Solution {
    public String addBinary(String a, String b) {
        if (a.length() < b.length()) {
            while (a.length() < b.length()) {
                a = 0 + a;
            }
        } 
        if (a.length() > b.length()) {
            while (a.length() > b.length()) {
                b = 0 + b;
            }
        } 

        String result = "";
        int carry = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            int sum = (Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(i)) + carry);
            int q = sum % 2;
            carry = sum / 2;
            result = q + result;
        } 

        if (carry != 0) {
            result = carry + result;
        }

        return result;
    }
}
