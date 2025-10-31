class Solution {
    public int[] countBits(int n) {
        if (n == 0) return new int[] {0};

        int[] ans = new int[n + 1];

        ans[0] = 0;
        ans[1] = 1;

        int i = 2;

        int newestIdxThatIsAPowerOfTwo = 0;

        while (i <= n) {
            int x = i;
            // one way to test that a number x is a power of two, is that x & (x - 1) == 0
            if ((x & (x - 1)) == 0) {
                newestIdxThatIsAPowerOfTwo = i;
                ans[newestIdxThatIsAPowerOfTwo] = 1;
            } else {
                ans[i] = ans[newestIdxThatIsAPowerOfTwo] + ans[i - newestIdxThatIsAPowerOfTwo];
            }
            
            i += 1;
        } 

        return ans;
    }
}
