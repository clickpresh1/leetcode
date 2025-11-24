class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();

        int x = 0, y = 0;

        while ((x < nums1.length) && (y < nums2.length)) {
            if ((nums1[x] == nums2[y])) {
                if (!(list.contains(nums1[x]))) {
                    list.add(nums1[x]);
                } 
                x += 1;
                y += 1;
            } else if (nums1[x] > nums2[y]) {
                y += 1;
            } else {
                x += 1;
            }
        } 

        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        } 

        return res;
    }
}
