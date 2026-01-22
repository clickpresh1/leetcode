class Solution {
    public int[] getConcatenation(int[] nums) {
        int m = nums.length;
        int[] arr = new int[2 * m];

        for (int i = 0; i < m; i++) {
            arr[i] = nums[i];
            arr[i + m] = nums[i];
        } 

        return arr;
    }
}
