class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int m = nums.size();
        int maxK = 1;
        int x = 1;
        int y = m / 2;
        while (x <= y) {
            int mid = x + ((y - x) / 2);
            if (value(nums, mid) != 0) {
                maxK = value(nums, mid);
                x = mid + 1;
            } else {
                y = mid - 1;
            }
        } 

        return maxK;
    } 

    public static int value(List<Integer> nums, int k) {
        if (hasIncreasingSubarrays(nums, k)) return k;
        else return 0;
    }

    public static boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int increasing = 1;
        int prevIncreasing = 0;

        for (int i = 1; i < nums.size(); ++i) {
        if (nums.get(i) > nums.get(i - 1)) {
            ++increasing;
        } else {
            prevIncreasing = increasing;
            increasing = 1;
        }
        if (increasing / 2 >= k || Math.min(prevIncreasing, increasing) >= k)
            return true;
        }

        return false;
    }
} 
