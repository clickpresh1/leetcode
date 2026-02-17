class Solution {
    public List<Integer> lastVisitedIntegers(int[] nums) {
        int m = nums.length, k = 0;
        List<Integer> seen = new ArrayList<>(), ans = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int f = nums[i];

            if (f != -1) {
                seen.add(f);
                k = 0;
            } else {
                k++;

                int y = seen.size();

                if (k <= y) ans.add(seen.get(y - k));
                else ans.add(-1);
            }
        } 

        return ans;
    }
}
