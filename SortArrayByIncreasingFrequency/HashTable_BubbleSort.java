class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int val = map.get(nums[i]);
                map.put(nums[i], val + 1);
            } else {
                map.put(nums[i], 1);
            }
        } 

        int[][] dp = new int[map.size()][2];
        int j = 0;
        for (Integer key : map.keySet()) {
            dp[j][0] = key;
            dp[j][1] = map.get(key);
            j += 1;
        } 

        for (int p = 0; p < dp.length - 1; p++) {
            for (int q = 0; q < dp.length - p - 1; q++) {
                if (dp[q][1] > dp[q + 1][1]) {
                    int[] temp = dp[q];
                    dp[q] = dp[q + 1];
                    dp[q + 1] = temp;
                } else if (dp[q][1] == dp[q + 1][1]) {
                    if (dp[q][0] < dp[q + 1][0]) {
                        int[] help = dp[q];
                        dp[q] = dp[q + 1];
                        dp[q + 1] = help;
                    }
                }
            }
        } 

        int r = 0;
        for (int i = 0; i < dp.length; i++) {
            for (int k = 0; k < dp[i][1]; k++) {
                nums[r] = dp[i][0];
                r += 1;
            }
        } 

        return nums;
    }
}
