class Solution {
    public int[] minBitwiseArray(List<Integer> nums) {
        int[] ans = new int[nums.size()];
        for (int i = 0; i < nums.size(); i++) {
            int j = 0;
            while (j < nums.get(i)) {
                if ((j | (j + 1)) == nums.get(i)) {
                    ans[i] = j;
                    break;
                }
                
                j += 1;
            } 

            if (ans[i] == 0) ans[i] = -1;
        } 

        return ans;
    }
}
