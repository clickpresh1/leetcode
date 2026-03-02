class Solution {
    public int minOperations(int[] nums, int k) {
        int cnt = 0;

        for (int item : nums) if (item < k) cnt++;

        return cnt;
    }
}
