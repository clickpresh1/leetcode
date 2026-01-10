class Solution {
    public int largestAltitude(int[] gain) {
        int m = gain.length, max = Integer.MIN_VALUE;

        int k = 0, i = 0;
        if (k > max) max = k;

        while (i < m) {
            k += gain[i++];
            if (k > max) max = k;
        } 

        return max;
    }
}
