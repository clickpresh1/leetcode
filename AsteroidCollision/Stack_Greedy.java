class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int m = asteroids.length;

        if (m == 1) return new int[] {asteroids[0]};

        Stack<Integer> stack = new Stack<>();

        stack.push(asteroids[0]);
        int u = 1;
        while (u < m) {
            if (!stack.isEmpty()) {
                int peek = stack.peek();
                int curr = asteroids[u];

                if (peek >= 0) {
                    if (curr >= 0) stack.push(curr);
                    else {
                        boolean addNeg = false;
                        while (!stack.isEmpty() && (stack.peek() >= 0)) {
                            if (Math.abs(curr) > stack.peek()) {
                                stack.pop();
                                addNeg = true;
                            } else if (Math.abs(curr) == stack.peek()) {
                                stack.pop();
                                addNeg = false;
                                break;
                            } else {
                                addNeg = false;
                                break;
                            }
                        } 

                        if (addNeg) stack.push(curr);
                    }
                } else stack.push(curr);
            } else stack.push(asteroids[u]);

            u++;
        } 

        int k = stack.size(), q = k;
        int[] arr = new int[k];
        while (!stack.isEmpty()) arr[--q] = stack.pop();

        return arr;
    }
}
