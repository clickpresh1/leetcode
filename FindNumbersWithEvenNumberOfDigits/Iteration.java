class Solution {
    public int findNumbers(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int y = 0;
            while (x != 0) {
                x /= 10;
                y += 1;
            } 

            if ((y % 2) == 0) sum += 1; 
        } 

        return sum;
    }
}
