class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());

        backtrack(nums, list, new ArrayList<>(), 0);

        return list;
    } 

    public static void backtrack(int[] nums, List<List<Integer>> list, List<Integer> temp, int x) {
        for (int i = x; i < nums.length; i++) {
                temp.add(nums[i]);
                if (!(list.contains(temp))) list.add(new ArrayList<>(temp));
                backtrack(nums, list, temp, i + 1);
                temp.remove(temp.size() - 1);
        }
    }
}
