class Solution {
    public String toGoatLatin(String sentence) {
        String[] str = sentence.split(" ");
        StringBuilder sc = new StringBuilder();
        sc.append("a");

        for (int i = 0; i < str.length; i++) {
            char c = str[i].charAt(0);
            boolean boo = (c == 'a') || (c == 'A') || (c == 'e') || (c == 'E') || (c == 'i') || (c == 'I') || (c == 'o') || (c == 'O') || (c == 'u') || (c == 'U');
            StringBuilder sb = new StringBuilder();

            if (boo) sb.append(str[i]).append("ma");
            else sb.append(str[i]).append(sb.charAt(0)).append("ma").deleteCharAt(0);

            str[i] = sb.append(sc).toString();

            sc.append("a");
        } 

        sc.setLength(0);

        for (String s : str) sc.append(s).append(" ");

        sc.deleteCharAt(sc.length() - 1);

        return sc.toString();
    }
}
