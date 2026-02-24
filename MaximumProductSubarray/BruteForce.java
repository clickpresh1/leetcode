class Solution {
    public int maxProduct(int[] nums) {
        int m = nums.length, mx = Integer.MIN_VALUE;

        for (int i = 0; i < m; i++) {
            int locMx = Integer.MIN_VALUE, locProd = nums[i];
            if (locProd > locMx) locMx = locProd;
            if (locMx == 0) {
                if (locMx > mx) mx = locMx;

                continue;
            }

            for (int j = i + 1; j < m; j++) {
                locProd *= nums[j];

                if (locProd > locMx) locMx = locProd;

                if (locProd == 0) break;
            } 

            if (locMx > mx) mx = locMx;
        } 

        return mx;
    }
}
