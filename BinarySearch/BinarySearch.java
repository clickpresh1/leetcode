class Solution {
    public int search(int[] nums, int target) {
        int m = nums.length, x = 0, y = m - 1;

        while (x <= y) {
            int mid = x + ((y - x) / 2);

            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) y = mid - 1;
            else x = mid + 1;
        } 

        return -1;
    }
}
