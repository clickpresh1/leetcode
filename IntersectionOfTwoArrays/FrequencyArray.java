class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int mx = -1, mn = 1001;
        int[] freq1 = new int[1001], freqControl = new int[1001];
        
        for (int item : nums1) {
            freq1[item]++;

            if (item > mx) mx = item;
            if (item < mn) mn = item;
        } 

        int count = 0;
        for (int item : nums2) {
            if (freq1[item] > 0) {
                if (freqControl[item] < freq1[item]) {
                    freqControl[item]++;
                    count++;
                }
            }
        } 

        int[] res = new int[count];
        for (int i = mn, j = 0; i <= mx; i++) {
            while (freqControl[i] > 0) {
                res[j++] = i;

                freqControl[i]--;
            }
        } 

        return res;
    }
}
