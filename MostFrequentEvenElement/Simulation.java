class Solution {
    public int mostFrequentEven(int[] nums) {
        int m = nums.length, mx = -1, mxFreq = 0;
        int[] map = new int[100001];

        for (int f : nums) {
            if (f % 2 == 0) {
                int g = ++map[f];

                if (g > mxFreq) {
                    mxFreq = g;
                    mx = f;
                } else if (g == mxFreq) if (f < mx) mx = f;
            }
        } 

        return mx;
    }
}
