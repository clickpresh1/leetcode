class Solution {
    public int averageValue(int[] nums) {
        int m = nums.length, count = 0, sum = 0;

        for (int item : nums) {
            if (item % 6 == 0) {
                sum += item;
                count++;
            }
        } 

        return (count != 0) ? sum / count : 0;
    }
}
