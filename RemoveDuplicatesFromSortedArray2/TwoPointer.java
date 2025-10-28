class Solution {
    public int removeDuplicates(int[] nums) {
        int m = nums.length;
        int x = 0;
        int i = 0;
        int count = 0;
        nums[x] = nums[0];
        x += 1;
        count += 1;
        i += 1;

        while (i < m) {
            if (nums[i] == nums[i - 1]) {
                if (count < 2) {
                    nums[x] = nums[i];
                    x += 1;
                    count += 1;
                    i += 1;
                } else {
                    i += 1;
                } 
            } else {
                count = 0;
                nums[x] = nums[i];
                x += 1;
                count += 1;
                i += 1;
            }
        }
        
        return x;
    }
}Re
