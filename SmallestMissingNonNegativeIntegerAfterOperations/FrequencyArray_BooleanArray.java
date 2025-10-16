class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int n = nums.length;
        int[] freq = new int[value];
        boolean[] boos = new boolean[n + 1];
        int currBoolFalseIndex = 0;
        for (int i = 0; i < n; i++) {
            int a = Math.floorMod(nums[i], value);
            nums[i] = a + (freq[a] * value);
            freq[a] += 1;
            int x = nums[i];
            if (x <= n) {
                boos[x] = true;
                if (x == currBoolFalseIndex) {
                    currBoolFalseIndex += 1;
                }
            }
        } 

        while (currBoolFalseIndex < n) {
            if (boos[currBoolFalseIndex] == true) {
                currBoolFalseIndex += 1;
            } else break;
        }
        
        return currBoolFalseIndex;
    } 
} 
