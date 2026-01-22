class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int m = s.length();
        int[] suffix = new int[m];

        suffix[m - 1] = shifts[m - 1] % 26;
        for (int i = m - 2; i >= 0; i--) {
            suffix[i] = (suffix[i + 1] % 26) + (shifts[i] % 26);
        } 

        char[] arr = new char[m];
        for (int i = 0; i < m; i++) {
            arr[i] = shiftMeth(s.charAt(i), suffix[i]);
        }

        return new String(arr);
    } 

    public static char shiftMeth(char c, int a) {
        int k = c - 'a';
        a %= 26;
        k += a;
        k %= 26;

        char res = (char) ('a' + k);

        return res;
    }
}
