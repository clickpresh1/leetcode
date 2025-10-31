class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            ans[i] = count(i);
        }
        
        return ans;
    } 

    public static int count(int n) {
        int count = 0;
        
        while (n > 0) {
            int x = n & 1;
            if (x == 1) count += 1;
            n >>= 1;
        } 

        return count;
    }
}
