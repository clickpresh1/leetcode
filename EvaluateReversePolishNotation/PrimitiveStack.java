class Solution {
    public int evalRPN(String[] tokens) {
        int m = tokens.length;
        int[] stack = new int[m];
        int top = -1;

        for (int i = 0; i < m; i++) {
            String str = tokens[i];
            char c = str.charAt(str.length() - 1);
            if ((c >= '*') && (c <= '/')) {
                int a = stack[top--], b = stack[top--], ab = 0;

                if (c == '+') ab = b + a;
                else if (c == '-') ab = b - a;
                else if (c == '*') ab = b * a;
                else ab = b / a;

                stack[++top] = ab;
            } else {
                int v = 0, len = str.length(), l = 0, sign = 1;

                if (str.charAt(0) == '-') {l++; sign = -1;}

                while (l < len) v = (v * 10) + (str.charAt(l++) - '0');

                stack[++top] = v * sign;
            }
        } 

        return stack[top];
    }
}
