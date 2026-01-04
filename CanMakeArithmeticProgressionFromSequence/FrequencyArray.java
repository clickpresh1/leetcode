class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        int  m = arr.length, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        int[] freq = new int[m];

        for (int i = 0; i < m; i++) {
            if (arr[i] < min) min = arr[i];

            if (arr[i] > max) max = arr[i];
        } 

        if (max == min) return true;

        
        if ((max - min) % (m - 1) != 0) return false;
        int commDiff = (max - min) / (m - 1);


        for (int i = 0; i < m; i++) {
            int k = arr[i] - min;
            if (k % commDiff != 0) return false;
            else {
                int q = k / commDiff;
                if (q >= m) return false;
                freq[q]++;
                if (freq[q] > 1) return false;
            } 
        } 

        return true;
    }
}
