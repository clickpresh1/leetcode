class Solution {
    public int sumDistance(int[] nums, String s, int d) {
        int m = nums.length, mod = 1000000007;
        long sum = 0, q = d;
        long[] pos = new long[m];
        char[] arr = s.toCharArray();

        for (int i = 0; i < m; i++) pos[i] = nums[i];

        for (int i = 0; i < m; i++) {
            if (arr[i] == 'R') pos[i] += q;
            else pos[i] -= q;
        }

        Arrays.sort(pos);

        long runPref = pos[0];
        for (int i = 1; i < m; i++) {
            long diff = ((pos[i] * i) - runPref) % mod;

            sum = (sum + diff) % mod;

            runPref += pos[i];
        }

        return (int) (sum % mod);
    }
}
