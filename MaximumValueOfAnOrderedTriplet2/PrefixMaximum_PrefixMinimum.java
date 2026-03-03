class Solution {
    public long maximumTripletValue(int[] nums) {
        int m = nums.length; 
        long mx = 0;
        long[] leftMx = new long[m], mxDiff = new long[m];

        int mxl = nums[0];
        for (int i = 0; i < m; i++) {
            if (nums[i] > mxl) mxl = nums[i];

            leftMx[i] = mxl;
        } 

        long diff = 0;
        for (int i = 1; i < m; i++) {
            long f = leftMx[i - 1] - nums[i];

            if (f > diff) diff = f;

            mxDiff[i] = diff;
        } 

        for (int i = 2; i < m; i++) {
            long f = mxDiff[i - 1] * nums[i];

            if (f > mx) mx = f;
        }

        return mx;
    }
}
