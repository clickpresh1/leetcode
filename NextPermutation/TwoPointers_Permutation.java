class Solution {
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int declineInd = -1;
        for (int i = n - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                declineInd = i - 1;
                break;
            } 
        } 

        if (declineInd == - 1) {
            int x = 0;
            int y = n - 1;
            while (x < y) {
                int helper = nums[x];
                nums[x] = nums[y];
                nums[y] = helper;
                x += 1;
                y -= 1;
            } 

            return;
        }

        int nextHump = declineInd + 1;
        for (int i = declineInd + 2; i < n; i++) {
            if ((nums[i] > nums[declineInd]) && (nums[i] <= nums[nextHump])) {
                nextHump = i;
            }
        } 

        int temp = nums[declineInd];
        nums[declineInd] = nums[nextHump];
        nums[nextHump] = temp;

        int x = declineInd + 1;
        int y = n - 1;
        while (x < y) {
            int helper = nums[x];
            nums[x] = nums[y];
            nums[y] = helper;
            x += 1;
            y -= 1;
        } 
    } 
}
