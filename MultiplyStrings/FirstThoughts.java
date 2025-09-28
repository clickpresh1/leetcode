// Code in progress...

class Solution {
    public static String multiply(String a, String b) {
        String valStringSum = "";

        for (int i = b.length() - 1; i >= 0; i--) {
            String valString = "";
            int q = 0;
            int val = 0;
            int carry = 0;
            for (int j = a.length() - 1; j >= 0; j--) {
                q = (Character.getNumericValue(a.charAt(j)) * Character.getNumericValue(b.charAt(i))) + carry;
                val = q % 10;
                carry = q / 10;
                valString = val + valString;

            } 
            if (carry > 0) {
                valString = carry + valString;
            } 
            valStringSum = add(valStringSum, valString);
            
        } 

        return valStringSum;
    } 

    public static String add(String a, String b) {
        int val = 0;
        int carry = 0;
        String valString = "";

        if (a.equals("")) {
            return b;
        } 

        if (a.length() < b.length()) {
            b = b + 0;
            while (a.length() < b.length()) {
                a = 0 + a;
            }
        } else if (b.length() < a.length()) {
            while (b.length() < a.length()) {
                b = b + 0;
            } 
            b = b + 0;
            a = 0 + a;
            
        } else {
            b = b + 0;
            a = 0 + a;
        }

        for (int i = b.length() - 1; i >= 0; i--) {
            val = ((Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(i))) + carry) % 10;
                carry = (Character.getNumericValue(a.charAt(i)) + Character.getNumericValue(b.charAt(i))) / 10;
                valString = val + valString;
        } 

        if (carry > 0) {
            valString = carry + valString;
        } 

        return valString;
    }

    public static void main(String[] args) {
        // System.out.println(mult(25, 25));
        // System.out.println(mult(2, 3));
        // System.out.println(multiply("123", "456"));
        System.out.println(multiply("123456789", "987654321"));
        
        

        // System.out.println(add("350", "140"));
        // System.out.println(add("738", "615"));
        // System.out.println(add("6888", "492"));


    }
}
