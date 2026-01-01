class Solution {
    public int maximumCount(int[] nums) {
        int m = nums.length, x = 0, y = m - 1;

        while (x <= y) {
            int mid = x + ((y - x) / 2);

            if (nums[mid] < 0) x = mid + 1;
            else y = mid - 1;
        } 

        int z = x;
        y = m - 1;

        while (z <= y) {
            int mid = z + ((y - z) / 2);

            if (nums[mid] == 0) z = mid + 1;
            else y = mid - 1;
        } 

        return (x > (m - z)) ? x : m - z;
    } 
}
