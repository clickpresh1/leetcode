class Solution {
    public int minLength(String s) {
        int m = s.length(), top = -1;
        char[] arr = s.toCharArray();
        int[] stack = new int[m];

        int i = 0;
        stack[++top] = arr[i];

        while (++i < m) {
            if (top != -1) {
                if (((stack[top] == 'A') && (arr[i] == 'B')) || ((stack[top] == 'C') && (arr[i] == 'D'))) top--;
                else stack[++top] = arr[i];
            } else {
                stack[++top] = arr[i];
            }
        } 

        return ++top;
    }
}
