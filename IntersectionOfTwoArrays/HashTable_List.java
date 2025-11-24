class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            if (!(map.containsKey(nums1[i]))) {
                map.put(nums1[i], 1);
            }
        } 

        for (int i = 0; i < nums2.length; i++) {
            if ((map.containsKey(nums2[i])) && (!(list.contains(nums2[i])))) {
                list.add(nums2[i]);
            }
        } 

        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        } 

        return res;
    }
}
