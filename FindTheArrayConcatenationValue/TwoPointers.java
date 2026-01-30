class Solution {
    public long findTheArrayConcVal(int[] nums) {
        int m = nums.length, x = -1, y = m;

        long concat = 0;

        while (++x < --y) {
            int f = nums[x];
            int g = nums[y];
            int j = 1;
            while (g > 0) {g /= 10; j *= 10;}

            concat += (nums[x] * j) + nums[y];
        } 

        return (m % 2 != 0) ? concat + nums[x] : concat;
    }
}
