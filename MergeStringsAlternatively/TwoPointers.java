class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length(), n = word2.length(), i = 0, j = 0;
        char[] arr = new char[m + n];

        int a = (m <= n) ? m : n;
        int b = a * 2;

        while ((j < b) && (i < a)) {
            arr[j++] = word1.charAt(i);
            arr[j++] = word2.charAt(i++);
        } 

        if (m > n) {
            while (i < m) arr[j++] = word1.charAt(i++);
        } else if (n > m) {
            while (i < n) arr[j++] = word2.charAt(i++);
        } 

        return new String(arr);
    }
}
