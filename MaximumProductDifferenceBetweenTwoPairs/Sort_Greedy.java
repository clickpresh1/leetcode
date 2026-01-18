class Solution {
    public int maxProductDifference(int[] nums) {
        int m = nums.length; 
        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE; 
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE; 

        for (int i = 0; i < m; i++) {
            int x = nums[i];

            if (x > max1) {
                max2 = max1; max1 = x;
            } else if (x > max2) max2 = x;

            if (x < min1) {
                min2 = min1; min1 = x;
            } else if (x < min2) min2 = x;
        } 

        return (max1 * max2) - (min1 * min2);
    }
}
