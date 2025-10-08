class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int m = a.length() - 1;
        int n = b.length() - 1;
        int carry = 0;
        
        while ((m >= 0) || (n >= 0) || carry > 0) {
            if (m >= 0) {
                carry += Character.getNumericValue(a.charAt(m));
                m -= 1;
            } 
            if (n >= 0) {
                carry += Character.getNumericValue(b.charAt(n));
                n -= 1;
            } 

            int sum = carry;
            sb.append(sum % 2);
            carry = sum / 2;
        } 

        return sb.reverse().toString();
    }
}
