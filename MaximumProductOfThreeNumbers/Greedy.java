class Solution {
    public int maximumProduct(int[] nums) {
        int m = nums.length; 
        if (m == 3) return nums[0] * nums[1] * nums[2];

        int maxM_1 = Integer.MIN_VALUE, maxM_2 = Integer.MIN_VALUE, maxM_3 = Integer.MIN_VALUE;

        int min_0 = Integer.MAX_VALUE, min_1 = Integer.MAX_VALUE;

        for (int item : nums) {
            if (item > maxM_1) {
                maxM_3 = maxM_2;
                maxM_2 = maxM_1;
                maxM_1 = item;
            } else if (item > maxM_2) {
                maxM_3 = maxM_2;
                maxM_2 = item;
            } else if (item > maxM_3) {
                maxM_3 = item;
            } 


            if (item < min_0) {
                min_1 = min_0;
                min_0 = item;
            } else if (item < min_1) {
                min_1 = item;
            }
        } 

        int x = maxM_1 * maxM_2 * maxM_3;
        int y = min_0 * min_1 * maxM_1;

        return (x >= y) ? x : y;
    }
}
