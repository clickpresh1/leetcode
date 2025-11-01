class Solution {
    public int[] countBits(int n) {
        if (n == 0) return new int[] {0};

        int[] ans = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            if ((i & 1) != 0) ans[i] = ans[i - 1] + 1;
            else {
                int x = i;
                x >>= 1;
                ans[i] = ans[x];
            }
        }

        return ans;
    }
}
