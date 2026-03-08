class Solution {
    public int subarraySum(int[] nums, int k) {
        int m = nums.length, cnt = 0;
        int[] pref = new int[m];

        pref[0] = nums[0];
        for (int i = 1; i < m; i++) {
            pref[i] = nums[i] + pref[i - 1];
        } 

        if (nums[0] == k) cnt++;

        for (int i = 1; i < m; i++) {
            if (pref[i] == k) cnt++;
            if (nums[i] == k) cnt++;
        }

        for (int i = 1; i < m - 1; i++) {
            for (int j = i + 1; j < m; j++) {
                if (pref[j] - pref[i - 1] == k) cnt++;
            } 
        } 

        return cnt;
    }
}
