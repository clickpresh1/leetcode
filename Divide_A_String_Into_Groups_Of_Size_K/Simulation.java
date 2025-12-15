class Solution {
    public String[] divideString(String s, int k, char fill) {
        int m = s.length(), n = m, j = 0;

        if (m % k != 0) n = ((m / k) + 1) * k;

        String[] str = new String[n / k];

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < m; i++) {
            sb.append(s.charAt(i));

            if (i % k == (k - 1)) {
                str[j++] = sb.toString();
                sb.setLength(0);
            } 
        } 

        if (n != m) {
            for (int i = m; i < n; i++) sb.append(fill);

            str[j] = sb.toString();
        } 

        return str;
    }
}
