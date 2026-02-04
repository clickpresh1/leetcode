class Solution {
    public int minLength(String s) {
        int m = s.length();
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();

        int i = 0;
        stack.push(arr[i++]);

        while (i < m) {
            if (!stack.isEmpty()) {
                if (((stack.peek() == 'A') && (arr[i] == 'B')) || ((stack.peek() == 'C') && (arr[i] == 'D'))) {
                    stack.pop();
                } else stack.push(arr[i]);
            } else stack.push(arr[i]);

            i++;
        }

        return stack.size();
        
    }
}
