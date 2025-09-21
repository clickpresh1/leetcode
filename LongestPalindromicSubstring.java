
class Solution {
    public static String longestPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        sb.append('#');
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i));
            sb.append('#');
        }
        sb.append('$');

        String sSb = sb.toString(); 

        int[] arr = new int[sSb.length()];
        
        return "";
    } 

    public static void main(String[] args) {
        String s = "ab";
        System.out.println(longestPalindrome(s));
    }
}
