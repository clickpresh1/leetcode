class Solution {
    public boolean checkString(String s) {
        boolean a = false, b = false;

        for (char c : s.toCharArray()) {
            if (!a) {
                if (!b) {
                    if (c == 'a') a = true;
                    else b = true;
                } else {
                    if (c == 'a') return false;
                }
            } else {
                if (!b) {
                    if (c == 'b') b = true;
                } else {
                    if (c == 'a') return false;
                }
            } 
        } 

        return true;
    }
}
