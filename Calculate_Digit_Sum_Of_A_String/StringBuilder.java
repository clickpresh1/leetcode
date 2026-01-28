class Solution {
    public String digitSum(String s, int k) {
        int m = s.length();

        while (s.length() > k) s = replace(s, k);

        return s;
    } 

    public static String replace(String s, int k) {
        int m = s.length(), i = 0;

        char[] S = s.toCharArray();

        StringBuilder sb = new StringBuilder();

        while (i < m) {
            int sum = 0, count = 0; 

            while ((count < k) && (i < m)) {
                sum += S[i++] - '0';

                count++;
            } 

            sb.append(sum);
        } 

        return sb.toString();
    }
}
