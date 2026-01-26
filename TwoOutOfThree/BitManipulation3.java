class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> list = new ArrayList<>();
        int[] bitMask = new int[101];

        for (int item : nums1) bitMask[item] |= 1;

        for (int item : nums2) bitMask[item] |= 2;

        for (int item : nums3) bitMask[item] |= 4;

        for (int i = 1; i < 101; i++) {
            int b = bitMask[i];

            // given that we used powers of 2 (1, 2, 4) for the bitMask,
            // if an element x is in at least two arrays, its bitMask
            // will not neither be 0 nor a power of 2.//
            // its bitMask will be either 3 or 5 or 6 or 7.
            // if x is in nums1 and nums2: bitMask == 3,
            // if x is in nums1 and nums3: bitMask == 5,
            // if x is in nums2 and nums3: bitMask == 6,
            // if x is in nums1 and nums2 and nums3: bitMask == 7.

            if ((b == 3) || (b == 5) || (b == 6) || (b == 7)) list.add(i);
        } 

        return list;
    }
}
