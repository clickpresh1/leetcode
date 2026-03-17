class Solution {
    public int findMaxLength(int[] nums) {
        int m = nums.length, mx = 0, runPref = 0;
        int[] map = new int[200001];

        int shift = 2;
        map[100000] = -1 + shift;
        for (int i = 0; i < m; i++) {
            if (nums[i] == 1) ++runPref;
            else --runPref; 

            int f = runPref + 100000;
            if (map[f] != 0) mx = Math.max(mx, i - (map[f] - shift));
            else map[f] = i + shift;
        } 

        return mx;
    }
}
