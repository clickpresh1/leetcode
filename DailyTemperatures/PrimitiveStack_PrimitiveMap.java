class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int m = temperatures.length;
        int[] stack = new int[m], map = new int[m];
        int top = -1;

        for (int i = 0; i < m; i++) {
            int w = temperatures[i];

            while ((top > -1) && (w > temperatures[stack[top]])) {
                int f = stack[top--];

                map[f] = i - f;
            } 

            stack[++top] = i;
        } 

        return map;
    }
}
