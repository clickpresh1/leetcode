class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length, mx = 0;

        for (int item : nums2) if (item > mx) mx = item;

        int[] map = new int[mx + 1];

        for (int i = 0; i < n; i++) map[nums2[i]] = i;

        for (int i = 0; i < m; i++) {
            int e = nums1[i], f = map[e], lcMn = n;
            
            for (int j = ++e; j < mx + 1; j++) {
                int g = map[j];

                if (g > f) {
                    if (g < lcMn) lcMn = g;
                } 
            } 

            if (lcMn == n) nums1[i] = -1;
            else nums1[i] = nums2[lcMn];
        }

        return nums1;
    }
}
