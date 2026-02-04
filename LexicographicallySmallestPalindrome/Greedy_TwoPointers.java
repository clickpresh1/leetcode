class Solution {
    public String makeSmallestPalindrome(String s) {
        int m = s.length();
        char[] arr = s.toCharArray();

        int x = -1, y = m;
        while (++x < --y) {
            if (arr[x] != arr[y]) {
                char a = arr[x], b = arr[y];
                char c = (a < b) ? a : b;

                arr[x] = c; arr[y] = c;
            }
        } 

        return new String(arr);
    } 
}
