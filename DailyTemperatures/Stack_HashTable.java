class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int m = temperatures.length;
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < m; i++) {
            int item = temperatures[i];

            while ((!stack.isEmpty()) && (item > temperatures[stack.peek()])) {
                int f = stack.pop();

                map.put(f, i - f);
            } 

            stack.push(i);
        } 

        for (int i = 0; i < m; i++) {
            temperatures[i] = map.getOrDefault(i, 0);
        } 

        return temperatures;
    }
}
