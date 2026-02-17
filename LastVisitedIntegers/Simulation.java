class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        int m = nums.length, k = 0;
        List<Integer> seen = new ArrayList<>(), ans = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int f = nums[i];

            if (f != -1) {
                seen.add(0, f);
                k = 0;
            } else {
                k++;

                if (k <= seen.size()) ans.add(seen.get(k - 1));
                else ans.add(-1);
            }
        } 

        return ans;
    }
}
