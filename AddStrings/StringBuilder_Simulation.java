class Solution {
    public String addStrings(String num1, String num2) {
        int m = num1.length() - 1;
        int n = num2.length() - 1;

        int car = 0;

        StringBuilder sb = new StringBuilder();

        while ((m >= 0) || (n >= 0) || (car != 0)) {
            int x = (m >= 0) ? num1.charAt(m) - '0' : 0;
            int y = (n >= 0) ? num2.charAt(n) - '0' : 0;
            int sum = car + x + y;
            sb.append(sum % 10);
            car = sum / 10;
            m -= 1;
            n -= 1;
        } 

        return sb.reverse().toString(); 
    }
}
