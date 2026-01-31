class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int mn1 = 10, mn2 = 10, commonMn = 10, bitmask = 0;

        for (int item : nums1) {
            bitmask |= (1 << item);

            if (item < mn1) mn1 = item;
        } 

        for (int item : nums2) {
            if ((bitmask & (1 << item)) != 0) {
                if (item < commonMn) commonMn = item;
            }

            if (item < mn2) mn2 = item;
        } 

        return (commonMn < 10) ? commonMn : ((mn1 < mn2) ? ((mn1 * 10) + mn2) : ((mn2 * 10) + mn1));
    }
}
