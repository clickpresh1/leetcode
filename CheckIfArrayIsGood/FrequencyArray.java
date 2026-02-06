class Solution {
    public boolean isGood(int[] nums) {
        int m = nums.length, mx = m - 1;

        int[] freq = new int[201];

        for (int item : nums) {
            if (item > mx) return false;

            freq[item]++;

            if (freq[item] > 2) return false;
        } 

        if (freq[mx] != 2) return false;

        for (int i = 1; i < mx; i++) {
            if (freq[i] != 1) return false;
        } 

        return true;
    }
}
