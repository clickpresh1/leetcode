class Solution {
    public boolean isPalindrome(String s) {
        String sSkim = "";
        String sSkimReverse = "";
        for (int i = 0; i < s.length(); i++) {
            if ((Character.isLetter(s.charAt(i))) || Character.isDigit(s.charAt(i))) {
                sSkim += String.valueOf(Character.toLowerCase(s.charAt(i)));
            } 

            if ((Character.isLetter(s.charAt(s.length() - 1 - i))) || Character.isDigit(s.charAt(s.length() - 1 - i))) {
                sSkimReverse += String.valueOf(Character.toLowerCase(s.charAt((s.length()) - 1 - i)));
            }
        } 

        return sSkim.equals(sSkimReverse);  
    } 
}
