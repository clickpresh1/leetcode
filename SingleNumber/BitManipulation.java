class Solution {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) return nums[0];
        
        int rez = nums[0] ^ nums[1];
        int i = 2;
        while (i < nums.length) {
            rez = rez ^ nums[i];
            i += 1;
        } 

        return rez;
    }
}
