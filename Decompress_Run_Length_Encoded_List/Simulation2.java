class Solution {
    public int[] decompressRLElist(int[] nums) {
        int m = nums.length, n = 0;

        for (int i = 0; i < m; i += 2) n += nums[i];

        int[] arr = new int[n];

        for (int i = 1, j = 0; i < m; i += 2) {
            Arrays.fill(arr, j, j + nums[i - 1], nums[i]);
            j += nums[i - 1];
        } 

        return arr;
    }
}
