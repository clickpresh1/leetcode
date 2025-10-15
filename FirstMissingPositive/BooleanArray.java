class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean[] rows = new boolean[n];
        
        int currBoolFalseIndex = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0) {
                continue;
            }
            else {
                int x = nums[i];
                if (x <= n) {
                    rows[x - 1] = true;
                    if (x - 1 == currBoolFalseIndex) {
                        currBoolFalseIndex += 1;
                    }
                }
            }
        } 

        while (currBoolFalseIndex < n) {
            if (rows[currBoolFalseIndex] == true) {
                currBoolFalseIndex += 1;
            } else break;
            
        }
        currBoolFalseIndex += 1;

        return currBoolFalseIndex;
    }
}
