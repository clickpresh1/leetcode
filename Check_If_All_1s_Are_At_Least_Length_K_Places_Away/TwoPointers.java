class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int x = -1;
        int count = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[i] == 1) {
                int y = x;
                count += 1;
                x = i;

                if (count >= 2) {
                    if (x - y < k + 1) {
                        return false;
                    }
                }
            } 

            i += 1;
        } 

        return true;
    }
}
