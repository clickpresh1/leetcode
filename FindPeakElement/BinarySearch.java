class Solution {
    public int findPeakElement(int[] nums) {
        int m = nums.length;

        if (m == 1) return 0;

        int x = 0, y = m - 1;
        while (x <= y) {
            int mid = x + ((y - x) / 2), f = nums[mid];

            if (mid == 0) {
                if (f > nums[mid + 1]) return mid;
                else if (f < nums[mid + 1]) x = mid + 1;
            } else if (mid == m - 1) {
                if (f > nums[mid - 1]) return mid;
                else if (f < nums[mid - 1]) y = mid - 1;
            } else {
                if ((f > nums[mid - 1]) && (f > nums[mid + 1])) return mid;
                else if (f < nums[mid - 1]) y = mid - 1;
                else if (f < nums[mid + 1]) x = mid + 1;
            }
        } 

        return 0;
    }
}
