class Solution {
    public String makeGood(String s) {
        int m = s.length(), i = 0;
        char[] arr = s.toCharArray();

        int n = greater(arr, m);

        while ((m - n) > 0) {
            m = n;

            n = greater(arr, m);
        }

        return new String(arr, 0, n);
    } 

    public static int greater(char[] a, int m) {
        int i = 0, n = m;

        while (i < m - 1) {
            char c = a[i], d = a[i + 1];

            if (((c ^ 32) == d) || ((d ^ 32) == c)) {
                a[i] = '0';
                a[i + 1] = '0';
                
                i += 2;
                n -= 2;
                
            } else {
                i++;
            }
        } 

        int j = 0;
        for (char c : a) if (c != '0') a[j++] = c;

        return n;
    }
}
