class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);

        while (search(nums, original) != -1) {
            original *= 2;
        } 

        return original;
    } 

    public static int search(int[] nums, int original) {
        int x = 0;
        int y = nums.length - 1;

        while (x <= y) {
            int mid = x + ((y - x) / 2);
            
            if (nums[mid] == original) {
                return mid;
            } else if (nums[mid] > original) {
                y = mid - 1;
            } else {
                x = mid + 1;
            }
        }  

        return -1;
    }
}
