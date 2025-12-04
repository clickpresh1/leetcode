class Solution {
    public static List<Integer> list = new ArrayList<>();

    public int[] separateDigits(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            helper(nums[i]);
        } 

        int[] arr = new int[list.size()];
        int j = 0;
        for (int item : list) arr[j++] = item;
        list.clear();

        return arr;
    } 

    public static void helper(int n) {
        int x = n;
        Stack<Integer> stack = new Stack<>();

        while (x > 0) {
            stack.push(x % 10);
            x /= 10;
        } 

        while (!(stack.isEmpty())) list.add(stack.pop());
    } 
}
