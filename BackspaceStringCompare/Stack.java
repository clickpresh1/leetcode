class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        return op(s).equals(op(t));
    } 

    public static String op(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != '#') stack.push(arr[i]);
            else if (!stack.isEmpty()) stack.pop();
        } 

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) sb.append(stack.pop());

        return sb.reverse().toString();
    }
}
