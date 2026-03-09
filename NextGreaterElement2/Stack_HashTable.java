class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int m = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < m; i++) {
            int item = nums[i];

            while ((!stack.isEmpty()) && (item > nums[stack.peek()])) {
                int f = stack.pop();

                map.put(f, item);
            } 

            stack.push(i);
        } 

        for (int i = 0; i < m; i++) {
            int item = nums[i];

            while ((!stack.isEmpty()) && (item > nums[stack.peek()])) {
                int f = stack.pop();

                map.put(f, item);
            }
        }

        for (int i = 0; i < m; i++) nums[i] = map.getOrDefault(i, -1);

        return nums;
    }
}
