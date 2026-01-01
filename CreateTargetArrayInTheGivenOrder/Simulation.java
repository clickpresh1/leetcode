class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int m = nums.length;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < m; i++) list.add(index[i], nums[i]);

        int[] arr = new int[m];

        for (int i = 0; i < m; i++) arr[i] = list.get(i);

        return arr;
    }
}
