class Solution {
    public long maximumTripletValue(int[] nums) {
        int m = nums.length;
        long mx = 0;

        for (int i = 0; i < m - 2; i++) {
            for (int j = i + 1; j < m - 1; j++) {
                for (int k = j + 1; k < m; k++) {
                    long a = nums[i], b = nums[j], c = nums[k];
                    long locVal = (a - b) * c;
                    
                    if (locVal > mx) mx = locVal;
                }
            }
        } 

        return mx;
    } 
}
