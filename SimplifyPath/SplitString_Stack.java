class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] split = path.split("/");
        int n = split.length;
        for (int i = 0; i < n; i++) {
            if (split[i].isEmpty() || split[i].equals(".")) continue;
            if (split[i].equals("..")) {
                if (stack.size() > 0) {
                    stack.pop();
                } 
                continue;
            } 
            stack.push(split[i]);
        } 
        if (stack.size() > 0) {
            if(stack.get(stack.size() - 1).equals("/")) stack.pop();
        } else return "/";
        
        StringBuilder sb = new StringBuilder();
        for (String l : stack) {
            sb.append("/");
            sb.append(l);
        }

        return sb.toString();
    }
}
