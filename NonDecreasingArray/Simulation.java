class Solution {
    public boolean checkPossibility(int[] nums) {
        int m = nums.length, i = 0;
        
        while ((i < m - 1) && (nums[i] <= nums[i + 1])) i++;

        return check(nums, i) || (check(nums, i + 1));
    } 

    public static boolean check(int[] arr, int indx) {
        int m = arr.length;

        int prev = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            if (i == indx) continue;

            if (arr[i] < prev) return false;

            prev = arr[i];
        } 

        return true;
    }
}
