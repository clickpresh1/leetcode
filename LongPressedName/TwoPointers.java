class Solution {
    public boolean isLongPressedName(String name, String typed) {
        if (name.length() > typed.length()) return false;

        int x = 0, y = 0, m = name.length(), n = typed.length();

        while ((x < m) && (y < n)) {
            char c = name.charAt(x);

            if (c != typed.charAt(y)) return false;

            int q = 0;
            while ((y < n) && (typed.charAt(y) == c)) {
                q++;
                y++;
            } 
            
            int k = 0;
            while ((x < m) && (name.charAt(x) == c)) {
                k++;
                if (k > q) return false;
                x++;
            } 
        } 

        return (x == m) && (y == n);
    }
}
