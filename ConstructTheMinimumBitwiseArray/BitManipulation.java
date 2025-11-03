class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans = new int[nums.size()];

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == 2) {
                ans[i] = -1;
                continue;
            } 

            if (((nums.get(i) - 1) % 4) == 0) {
                ans[i] = nums.get(i) - 1;
                continue;
            } 

            if (((nums.get(i) + 1) % 4) == 0) {
                if (((nums.get(i) & (nums.get(i) + 1))) == 0) {
                    ans[i] = nums.get(i) / 2;
                    continue;
                } 
            } 

            ans[i] = check(nums.get(i));

        } 

        return ans;
    } 

    public static int check(int n) {
        String s = Integer.toBinaryString(n);
        int x = n;
        int i = 0;
        while ((x & 1) != 0) {
            x >>= 1;
            i += 1;
        } 

        int b = 1 << (i - 1);
        b = ~b;

        return n &= b;

        
    } 
} 


