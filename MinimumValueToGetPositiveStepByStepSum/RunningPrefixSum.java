class Solution {
    public int minStartValue(int[] nums) {
        int m = nums.length, runPref = nums[0], mnPref = runPref;

        for (int i = 1; i < m; i++) {
            runPref += nums[i];

            if (runPref < mnPref) mnPref = runPref;
        }

        return mnPref-- < 0 ? -mnPref : 1;
    }
}
