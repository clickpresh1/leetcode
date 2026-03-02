class Solution {
    public int sumOfBeauties(int[] nums) {
        int m = nums.length;
        int[] suff = new int[m];

        int mnr = nums[m - 1];
        for (int i = m - 1; i >= 0; i--) {
            if (nums[i] < mnr) mnr = nums[i];

            suff[i] = mnr;
        } 

        int sum = 0, mxl = nums[0];
        for (int i = 1; i < m - 1; i++) {
            int c = nums[i];

            if ((c > mxl) && (c < suff[i + 1])) sum += 2;
            else if ((c > nums[i - 1]) && (c < nums[i + 1])) sum += 1;

            if (c > mxl) mxl = c;
        } 

        return sum;
    }
}
