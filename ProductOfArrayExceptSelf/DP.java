class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] L = new int[nums.length];
        int[] R = new int[nums.length];
        L[0] = 1;
        R[nums.length - 1] = 1;

        for (int i = 1; i < nums.length; i++) {
            L[i] = nums[i - 1] * L[i - 1];
            R[nums.length - i - 1] = nums[nums.length - i] * R[nums.length - i];
        } 

        for (int i = 0; i < nums.length; i++) {
            nums[i] = L[i] * R[i];
        }

        return nums;
    }
}
