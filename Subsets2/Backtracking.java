class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());

        backtrack(nums, list, new ArrayList<>(), new boolean[nums.length], 0);

        return list;
    } 

    public static void backtrack(int[] nums, List<List<Integer>> list, List<Integer> temp, boolean[] boos, int z) {
        for (int i = z; i < nums.length; i++) {
            if ((boos[i]) || ((i > 0) && (nums[i] == nums[i - 1]) && (!(boos[i - 1])))) continue;
            else {
                boos[i] = true;
                temp.add(nums[i]);
                list.add(new ArrayList<>(temp));
                backtrack(nums, list, temp, boos, i + 1);
                boos[i] = false;
                temp.remove(temp.size() - 1);
            }
        }
    }
}
