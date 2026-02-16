class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int m = nums.length, cnt = 0, len = 201 + diff;
        int[] map = new int[len];

        for (int f : nums) map[f]++;

        for (int f : nums) {
            if ((f < diff) || (f > len)) continue;

            if ((map[f - diff] == 1) && (map[f + diff] == 1)) cnt++;
        }

        return cnt;
    }
}
