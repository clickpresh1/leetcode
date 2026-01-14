class Solution {
    public int sumOfUnique(int[] nums) {
        int m = nums.length, sum = 0;
        int[] freq = new int[101];

        for (int i = 0; i < m; i++) {
            if (freq[nums[i]] == 0) {
                sum += nums[i];
                freq[nums[i]] = 1;
            } else if (freq[nums[i]] == 1) {
                sum -= nums[i];
                freq[nums[i]] = 2;
            } 
        } 

        return sum;
    }
}
