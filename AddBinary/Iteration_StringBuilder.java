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

        StringBuilder sb = new StringBuilder();
        int carry = 0;
        for (int i = a.length() - 1; i >= 0; i--) {
            int sum = (a.charAt(i) - '0') + (b.charAt(i) - '0') + carry;
            int q = sum % 2;
            carry = sum / 2;
            sb.append(q);
        } 

        if (carry != 0) {
            sb.append(carry);
        }

        return sb.reverse().toString();
    }
}
