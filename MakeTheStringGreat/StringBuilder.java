class Solution {
    public String makeGood(String s) {
        StringBuilder sb = new StringBuilder(s);
        
        int i = 0;
        while (i < (sb.length() - 1)) {
            char c = sb.charAt(i), d = sb.charAt(i + 1);

            if (((c ^ 32) == d) || ((d ^ 32) == c)) {
                sb.delete(i, i + 2);

                if (i > 0) i--;
            } else i++;
        } 

        return sb.toString();
    }
}
