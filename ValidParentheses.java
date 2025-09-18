class Solution {
    public boolean isValid(String s) {
        boolean isValid = false;
        int count = 0;
        if (s.length() % 2 != 0) {
            isValid = false;
        } else if ((countChar(s, '(') != countChar(s, ')')) || (countChar(s, '{') != countChar(s, '}')) || (countChar(s, '[') != countChar(s, ']'))) { 
            isValid = false;
            
        } else if ((s.charAt(0) == ')') || (s.charAt(0) == '}') || (s.charAt(0) == ']')) {
            isValid = false;
        } else if ((s.charAt(s.length() - 1) == '(') || (s.charAt(s.length() - 1) == '{') || (s.charAt(s.length() - 1) == '[')) {
            isValid = false;
        } 
        else {
            while ((s.contains("()")) || (s.contains("{}")) || (s.contains("[]"))) { 
                s = s.replace("()", "");
                s = s.replace("{}", "");
                s = s.replace("[]", "");
                
            } 
            if (s.isEmpty()) {
                isValid = true;
            }
        }      
        return isValid;
    } 

    public static int countChar(String s, char c) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                count += 1;
            }
        } 

        return count;
    }

}
