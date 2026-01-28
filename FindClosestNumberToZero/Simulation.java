class Solution {
    public int findClosestNumber(int[] nums) {
        int m = nums.length, diff = Integer.MAX_VALUE,val = nums[0];

        for (int item : nums) {
            int locDiff = (item >= 0) ? item : -item;

            if (locDiff < diff) {diff = locDiff; val = item;}
            else if (locDiff == diff) {
                if (item > val) val = item;
            } 
        } 

        return val;
    }
}
