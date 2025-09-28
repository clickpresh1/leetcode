class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int perim = 0;
        
        for (int i = 2; i < nums.length; i++) {
            int L = i - 2;
            int R = i - 1;
            int check = nums[L] + nums[R];
            if (check > nums[i]) {
                perim = Math.max(perim, check + nums[i]);
            } 
        } 

        return perim;
    } 
}
