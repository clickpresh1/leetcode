class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] bitmaskArr = new int[1001];

        int mx = -1, mn = 1001, bitmaskPower = 0;

        for (int item : nums1) {
            bitmaskArr[item] |= 1;

            if (item > mx) mx = item;
            if (item < mn) mn = item;
        } 

        int count = 0, locBitmask = 0;
        for (int item : nums2) {
            if (bitmaskArr[item] == 3) continue;

            bitmaskArr[item] |= 2;

            if (bitmaskArr[item] == 3) count++;
        } 

        int[] res = new int[count];
        for (int i = mn, j = 0; i <= mx; i++) {
            if (bitmaskArr[i] == 3) res[j++] = i;
        } 

        return res;
    }
}
