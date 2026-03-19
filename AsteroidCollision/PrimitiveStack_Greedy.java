class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        int m = asteroids.length;
        if (m == 1) return new int[] {asteroids[0]};

        int[] stack = new int[m];
        int top = -1;

        stack[++top] = asteroids[0];

        int u = 1;
        while (u < m) {
            if (top != -1) {
                int head = stack[top], curr = asteroids[u];
                if (head >= 0) {
                    if (curr >= 0) stack[++top] = curr;
                    else {
                        boolean addCurr = false;
                        while ((top != -1) && (stack[top] >= 0)) {
                            if (-curr > stack[top]) {
                                --top;
                                addCurr = true;
                            } else if (-curr == stack[top]) {
                                --top;
                                addCurr = false;
                                break;
                            } else {
                                addCurr = false;
                                break;
                            }
                        } 
                        if (addCurr) stack[++top] = curr;
                    }
                } else stack[++top] = curr;
            } else stack[++top] = asteroids[u];
            u++;
        } 

        return Arrays.copyOf(stack, ++top);
    }
}
