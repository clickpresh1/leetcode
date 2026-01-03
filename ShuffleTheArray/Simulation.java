class Solution {
    public int[] shuffle(int[] nums, int n) {
        int m = nums.length;
        int[] arr = new int[m];

        int i = 0, j = 0;
        while (i < m) {
            arr[i++] = nums[j];
            arr[i++] = nums[n + j++];
        } 

        return arr;
    }
}
