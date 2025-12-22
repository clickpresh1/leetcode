class Solution {
    public int maxDivScore(int[] nums, int[] divisors) {
        int m = nums.length, n = divisors.length;
        int globalMax = 0, indx = 0;

        for (int i = 0; i < n; i++) {
            int localMax = 0;
            
            for (int j = 0; j < m; j++) 
                if (nums[j] % divisors[i] == 0) localMax++;

            if (localMax > globalMax) {
                globalMax = localMax;
                indx = i;
            } else if (localMax == globalMax) {
                if (divisors[i] < divisors[indx]) indx = i;
            } 
        } 

        return divisors[indx];
    }
}
