class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int m = nums.length, k = 0;
        int[] arr = new int[2];

        for (int i = 0; i < m; i++) nums[i]++;

        for (int i = 0; i < m; i++) {
            int v = nums[i];
            if (v < 0) v = -v;

            if (nums[v - 1] < 0) arr[k++] = v - 1;
            else nums[v - 1] = -(nums[v - 1]);
        } 

        return arr;
    }
}
