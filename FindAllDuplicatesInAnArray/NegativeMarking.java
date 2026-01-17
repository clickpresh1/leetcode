class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int m = nums.length;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            int v = nums[i];
            if (v < 0) v = -v;

            if (nums[v - 1] < 0) list.add(v);
            else nums[v - 1] = -(nums[v - 1]);
        } 

        return list;
    }
}
