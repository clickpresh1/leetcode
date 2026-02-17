class Solution {
    public int evalRPN(String[] tokens) {
        int m = tokens.length;
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < m; i++) {
            String str = tokens[i];
            char c = str.charAt(str.length() - 1);
            if ((c >= '*') && (c <= '/')) {
                int a = stack.pop(), b = stack.pop();

                int ab = 0;

                if (c == '+') ab = b + a;
                else if (c == '-') ab = b - a;
                else if (c == '*') ab = b * a;
                else {
                    if (a != 0) ab = b / a;
                } 

                stack.push(ab);
            } else {
                int v = 0, len = str.length(), l = 0, sign = 1;

                if (str.charAt(0) == '-') {l++; sign = -1;}

                while (l < len) v = (v * 10) + (str.charAt(l++) - '0');

                stack.push(v * sign);
            }
        } 

        return stack.pop();
    }
}
