class Solution {
    public String makeGood(String s) {
        int m = s.length(), top = -1;
        char[] stack = new char[m];

        for (int i = 0; i < m; i++) {
            if ((top >= 0) && ((stack[top] ^ 32) == s.charAt(i))) top--;
            else stack[++top] = s.charAt(i);
        } 

        return new String(stack, 0, top + 1);
    }
}
