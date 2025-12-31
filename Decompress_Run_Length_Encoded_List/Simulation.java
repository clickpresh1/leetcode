class Solution {
    public int[] decompressRLElist(int[] nums) {
        int m = nums.length, n = 0;

        for (int i = 0; i < m; i += 2) n += nums[i];

        int[] arr = new int[n];

        for (int i = 1, j = 0; i < m; i += 2) {
            int k = nums[i - 1];
            while (k > 0) {
                arr[j++] = nums[i];
                k--;
            } 
        } 

        return arr;
    }
}
