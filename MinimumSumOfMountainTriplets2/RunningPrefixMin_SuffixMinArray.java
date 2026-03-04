class Solution {
    public int minimumSum(int[] nums) {
        int m = nums.length, mn = Integer.MAX_VALUE;
        int[] suff = new int[m];

        int mnr = nums[m - 1];
        for (int i = m - 1; i >= 0; i--) {
            if (nums[i] < mnr) mnr = nums[i];

            suff[i] = mnr;
        } 

        int mnl = nums[0];
        for (int i = 1; i < m - 1; i++) {
            int f = nums[i], g = suff[i + 1];
            
            if ((f > mnl) && (f > g)) {
                int sum = mnl + f + g;

                if (sum < mn) mn = sum;
            } 

            if (f < mnl) mnl = f;
        } 

        return (mn == Integer.MAX_VALUE) ? -1 : mn;
    }
}
