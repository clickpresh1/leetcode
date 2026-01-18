class Solution {
    public String removeStars(String s) {
        int m = s.length(), top = -1;
        char[] stack = new char[m];

        for (char c : s.toCharArray()) {
            if (top == -1) {
                if (c != '*') {stack[++top] = c;}
            } else {
                if (c == '*') top--;
                else stack[++top] = c;
            }
        } 

        return new String(stack, 0, top + 1);
    }
}
