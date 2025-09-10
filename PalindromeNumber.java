class Solution {
    public static boolean isPalindrome(int x) {
        String input = String.valueOf(x);
        String inputReverse = "";
        int samenessCount = 0;
        boolean isPalindrome = false;
        for (int i = (input.length() - 1); i >= 0; i--) {
            inputReverse += input.charAt(i);
        } 
        
        for (int j = 0; j < input.length(); j++) {
            if (input.charAt(j) == inputReverse.charAt(j)) {
                samenessCount += 1;
            }
        } 

        if (samenessCount == input.length()) {
            isPalindrome = true;
        } 

        // System.out.println(input);
        // System.out.println(inputReverse.length());
        return isPalindrome; 
    } 

    // public static void main(String[] args) {
    //     System.out.println(isPalindrome(121));

    // }
}
