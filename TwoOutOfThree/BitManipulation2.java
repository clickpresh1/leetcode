class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> list = new ArrayList<>();

        BitSet b = new BitSet();

        BitSet firstB = new BitSet();
        for (int item : nums1) {
            if (!firstB.get(item)) {firstB.set(item); b.set(item);}
        }

        BitSet secondB = new BitSet();
        for (int item : nums2) {
            if (!secondB.get(item)) {
                secondB.set(item);

                if (!b.get(item)) {
                    b.set(item);
                } else list.add(item);
            }
        } 

        BitSet thirdB = new BitSet();
        for (int item : nums3) {
            if (!thirdB.get(item)) {
                thirdB.set(item);

                if (!b.get(item)) {
                    b.set(item);
                } else {
                    if (!list.contains(item)) list.add(item);
                }
            }
        } 

        return list;
    }
}
