class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty()) return true;
        if (s.length() > t.length()) return false;

        int x = 0;
        int y = 0;
        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();

        while (y < arr2.length) {
            if (arr1[x] == arr2[y]) {
                x += 1;
            } 

            y += 1;

            if (x == arr1.length) return true;
        } 

        return false;
    }
}
