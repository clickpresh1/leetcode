class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums);

        return list;
    } 

    public static void backtrack(List<List<Integer>> list, List<Integer> temp, int[] nums) {
        int n = nums.length;
        if (temp.size() == n) list.add(new ArrayList<>(temp));
        else {
            for (int i = 0; i < n; i++) {
                if (temp.contains(nums[i])) continue;
                else {
                    temp.add(nums[i]);
                    backtrack(list, temp, nums);
                    temp.remove(temp.size() - 1);
                }
            }
        }

    }
}
