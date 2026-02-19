class Solution {
    public long smallestNumber(long num) {
        int[] freq = new int[19];
        long x = num;
        boolean neg = false;
        
        while (x != 0) {
            int mod = (int) (x % 10);

            if (mod < 0) neg = true;

            freq[mod + 9]++;

            x /= 10;
        } 

        long res = 0;

        if (neg) {
            for (int i = 0; i < 10; i++) {
                while (freq[i] != 0) {
                    res = (res * 10) + (i - 9);

                    freq[i]--;
                }
            }
        } else {
            for (int i = 10; i < 19; i++) {
                if (freq[i] > 0) {
                    res = i - 9;

                    freq[i]--;

                    break;
                }
            } 

            for (int i = 9; i < 19; i++) {
                while (freq[i] > 0) {
                    res = (res * 10) + (i - 9);
                        
                    freq[i]--;
                }
            }
        }

        return res;
    }
}
