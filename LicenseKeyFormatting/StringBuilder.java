class Solution {
    public String licenseKeyFormatting(String s, int k) {
        int count = k;
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (count > 0) {
                if (s.charAt(i) != '-') {
                    sb.append(Character.toUpperCase(s.charAt(i)));
                    count -= 1;
                } 
            } else {
                sb.append('-');
                count = k;
                if (s.charAt(i) != '-') {
                    sb.append(Character.toUpperCase(s.charAt(i)));
                    count -= 1;
                } 
            }
        } 

        if ((sb.length() != 0) && (sb.charAt(sb.length() - 1) == '-')) {
            sb.deleteCharAt(sb.length() - 1);
        }

        return sb.reverse().toString();
    }
}
