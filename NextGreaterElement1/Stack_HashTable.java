class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int item = nums2[i];

            while ((!stack.isEmpty()) && (item > stack.peek())) {
                map.put(stack.pop(), item);
            }

            stack.push(item);
        } 

        for (int i = 0; i < m; i++) {
            nums1[i] = map.getOrDefault(nums1[i], -1);
        }

        return nums1;
    }
}
