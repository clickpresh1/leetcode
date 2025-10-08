class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int m = a.length() - 1;
        int n = b.length() - 1;
        int carry = 0;
        
        while ((m >= 0) || (n >= 0) || carry > 0) {
            if (m >= 0) {
                carry += a.charAt(m--) - '0';
            } 
            if (n >= 0) {
                carry += b.charAt(n--) - '0';
            } 

            int sum = carry;
            sb.append(sum % 2);
            carry = sum / 2;
        } 

        return sb.reverse().toString();
    }
}
