class Solution {
    public int[] buildArray(int[] nums) {
        int m = nums.length;
        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = nums[nums[i]];
        } 

        return arr;
    }
}
