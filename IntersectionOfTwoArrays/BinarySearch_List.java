class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            if ((check(nums2, nums1[i])) && (!(list.contains(nums1[i])))) {
                list.add(nums1[i]);
            }
        } 

        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        } 

        return res;
    } 

    public static boolean check(int[] arr, int s) {
        int x = 0;
        int y = arr.length - 1;
        while (x <= y) {
            int mid = x + ((y - x) / 2);
            if (arr[mid] == s) return true;
            else if (arr[mid] > s) {
                y = mid - 1;
            } else {
                x = mid + 1;
            }
        } 

        return false;
    }
}
