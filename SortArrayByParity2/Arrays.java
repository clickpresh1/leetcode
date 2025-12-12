class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int m = nums.length, n = m / 2;
        int[] even = new int[n], odd = new int[n];

        for (int i = 0, j = 0, k = 0; i < m; i++) {
            if (nums[i] % 2 == 0) even[j++] = nums[i];
            else odd[k++] = nums[i];
        } 
        
        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) nums[i] = even[i / 2];
            else nums[i] = odd[i / 2];
        } 

        return nums;
    }
}
