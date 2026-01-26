class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> list = new ArrayList<>();

        int[] firstFreq = new int[101];
        for (int item : nums1) firstFreq[item]++;
        
        int[] secFreq = new int[101];
        for (int item : nums2) {
            secFreq[item]++;

            if (secFreq[item] == 1) {
                if (firstFreq[item] > 0) list.add(item);
            }
        } 

        int[] thirdFreq = new int[101];
        for (int item : nums3) {
            thirdFreq[item]++;

            if (thirdFreq[item] == 1) {
                if ((firstFreq[item] > 0) || (secFreq[item] > 0)) {
                    if (!list.contains(item)) list.add(item);
                }
            }
        } 

        return list;
    }
}
