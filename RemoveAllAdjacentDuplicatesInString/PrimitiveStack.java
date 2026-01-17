class Solution {
    public String removeDuplicates(String s) {
        int m = s.length(), i = 0, top = -1;
        char[] stack = new char[m];

        while (i < m) {
            if (top == -1) {stack[++top] = s.charAt(i);}
            else {
                if (s.charAt(i) == stack[top]) {top--;}
                else stack[++top] = s.charAt(i);
            } 

            i++;
        } 

        return new String(stack, 0, top + 1);
    }
}
