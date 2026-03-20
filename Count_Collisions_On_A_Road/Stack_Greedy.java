class Solution {
    public int countCollisions(String directions) {
        int m = directions.length();
        char[] arr = directions.toCharArray();
        Stack<Character> stack = new Stack<>();
        int cnt = 0;

        int u = 0;
        while (u < m) {
            char curr = arr[u];
            if (!stack.isEmpty()) {
                if (curr == 'L') {
                    if (stack.peek() == 'R') {
                        cnt += 2;
                        stack.pop();

                        while ((!stack.isEmpty()) && stack.peek() == 'R') {
                            cnt++;
                            stack.pop();
                        }

                        stack.push('S');
                    } else if (stack.peek() == 'S') {
                        cnt++;
                        stack.push('S');
                    } else stack.push('L');
                } else if (curr == 'S') {
                    if (stack.peek() == 'R') {

                        while ((!stack.isEmpty()) && stack.peek() == 'R') {
                            cnt++;
                            stack.pop();
                        } 

                        stack.push('S');
                    } else if (stack.peek() == 'L') stack.push('S');
                    else if (stack.peek() == 'S') stack.push('S');
                } else stack.push('R');
            } else stack.push(curr);

            u++;
        } 

        return cnt;
    }
}
