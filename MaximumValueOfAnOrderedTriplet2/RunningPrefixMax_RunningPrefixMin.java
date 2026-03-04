class Solution {
    public long maximumTripletValue(int[] nums) {
        int m = nums.length; 
        long mx = 0, mxl = nums[0], mxD = 0;
        
        for (int i = 2; i < m; i++) {
            if (nums[i - 2] > mxl) mxl = nums[i - 2];

            long diff = mxl - nums[i - 1];

            if (diff > mxD) mxD = diff;

            long prod = mxD * nums[i];

            if (prod > mx) mx = prod;
        }

        return mx;
    }
}
