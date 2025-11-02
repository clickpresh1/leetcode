class Solution {
    public int[] evenOddBit(int n) {
        int[] freq = new int[2];

        int i = 0;
        while ((n >> i) != 0) {
            if ((i % 2) == 0) {
                if (((n >> i) & 1) == 1) freq[0] += 1;
            } else {
                if (((n >> i) & 1) == 1) freq[1] += 1;
            } 

            i += 1;
        } 

        return freq;
    }
}
