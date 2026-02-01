class Solution {
    public int maximizeSum(int[] nums, int k) {
        int mx = -1, res = 0;

        for (int item : nums) if (item > mx) mx = item;

        while (k-- > 0) res += mx++;

        return res;
    }
}
