class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        char[] arr = s.toCharArray();
        int m = arr.length, i = 0;

        while (i < m) {
            if (stack.isEmpty()) stack.push(arr[i]);
            else {
                if (arr[i] == stack.peek()) stack.pop();
                else stack.push(arr[i]);
            } 

            i++;
        } 

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        } 

        return sb.reverse().toString();
    }
}
