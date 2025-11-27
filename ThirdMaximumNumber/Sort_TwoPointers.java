class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);

        int i = nums.length - 1;
        int y = nums[nums.length - 1];
        int x = y;
        int count = 1;
        i -= 1;

        while (i >= 0) {
            if (nums[i] != x) {
                x = nums[i];
                count += 1;
                if (count == 3) return nums[i];
            } 

            i -= 1;
        } 

        return y;
    }
}
