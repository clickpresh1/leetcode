class Solution {
    public int[] productExceptSelf(int[] nums) {
        int m = nums.length;
        int[] L = new int[m];
        L[0] = 1; 

        for (int i = 1; i < m; i++) {
            L[i] = nums[i - 1] * L[i - 1];
        } 

        int prevR = 1;
        for (int i = m - 1; i >= 0; i--) {
            L[i] = L[i] * prevR;
            prevR = nums[i] * prevR;
        }

        return L;
    }
}
