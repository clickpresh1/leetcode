class Solution {
    public String sortSentence(String s) {
        String[] str = new String[9];
        int m = s.length(), max = 0, i = m - 1;;
        
        while (i >= 0) {
            if (Character.isDigit(s.charAt(i))) {
                int k = s.charAt(i) - '0';
                if (k > max) max = k;
                int j = i--;
                while ((i >= 0) && (s.charAt(i) != ' ')) i--;

                str[k - 1] = s.substring(i + 1, j);
            } else i--;
        } 

        StringBuilder tb = new StringBuilder();

        for (int j = 0; j < max; j++) tb.append(str[j]).append(' ');

        return tb.deleteCharAt(tb.length() - 1).toString();
    }
}
