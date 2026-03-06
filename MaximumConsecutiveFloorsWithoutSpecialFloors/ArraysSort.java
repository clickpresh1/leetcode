class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        int m = special.length, mx = 0;

        Arrays.sort(special);

        int locMx = special[0] - bottom;

        if (locMx > mx) mx = locMx;

        for (int i = 1; i < special.length; i++) {
            locMx = special[i] - special[i - 1] - 1;

            if (locMx > mx) mx = locMx;
        } 

        locMx = top - special[m - 1];

        if (locMx > mx) mx = locMx;

        return mx;
    }
}
