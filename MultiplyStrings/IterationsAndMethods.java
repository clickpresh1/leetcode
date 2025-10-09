class Solution {
    public String multiply(String num1, String num2) {
        if (checkZeros(num1) || checkZeros(num2)) {
            return "0";
        }

        List<String> list = new ArrayList<>();
        int n = num2.length();
        for (int i = n - 1; i >= 0; i--) {
            String x = String.valueOf(num2.charAt(i));
            String prod = product(num1, x);
            list.add(prod);
        } 

        String sum = "";
        for (int i = 0; i < n; i++) {
            sum = addStrings(sum, zeros(list.get(i), i));
        } 

        return sum;
    } 

    public static String zeros(String b, int n) {
        if (n == 0) return b;
        StringBuilder sb = new StringBuilder();
        sb.append(b);
        for (int i = 1; i <= n; i++) {
            sb.append(0);
        } 

        return sb.toString();
    }

    public static String addStrings(String a, String b) {
        if (a.equals("")) return b;

        int m = a.length() - 1;
        int n = b.length() - 1;
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while ((m >= 0) || (n >= 0) || (carry > 0)) {
            if (m >= 0) {
                carry += a.charAt(m--) - '0';
            } 
            if (n >= 0) {
                carry += b.charAt(n--) - '0';
            } 

            int sum = carry;
            sb.append(sum % 10);
            carry = sum / 10;
        } 

        return sb.reverse().toString();
    } 

    public static String product(String a, String b) {
        if ((Integer.valueOf(b) == 0)) {
            return "0";
        } 

        if (checkZeros(a)) return "0";

        int m = a.length() - 1;
        int x = b.charAt(0) - '0';
        int carry = 0;
        StringBuilder sb = new StringBuilder();

        while ((m >= 0) || (carry > 0)) {
            if (m >= 0) {
                int p = a.charAt(m) - '0';
                int prod = p * x;
                carry += prod;
                m -= 1;
            } 

            int sum = carry;
            sb.append(sum % 10);
            carry = sum / 10;
        } 

        return sb.reverse().toString();
    } 

    public static boolean checkZeros(String a) {
        int m = a.length();
        int count = 0;
        for (int i = m - 1; i >= 0; i--) {
            int x = a.charAt(i) - '0';
            if (x == 0) {
                count += 1;
            } 
        } 
        if (count == m) return true;
        else return false;
    }
}
