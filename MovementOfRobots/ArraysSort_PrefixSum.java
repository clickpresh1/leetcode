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

        long[] pref = new long[m];
        pref[0] = pos[0];
        for (int i = 1; i < m; i++) pref[i] = pos[i] + pref[i - 1];

        for (int i = m - 1; i > 0; i--) {
            long diff = ((pos[i] * i) - pref[i - 1]) % mod ;

            sum = (sum + diff) % mod;
        }

        return (int) (sum % mod);
    }
}
