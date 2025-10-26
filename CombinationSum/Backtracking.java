class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();

        backtrack(candidates, target, list, new ArrayList<>(), 0);

        return list;
    } 

    public static void backtrack(int[] candidates, int target, List<List<Integer>> list, List<Integer> temp, int x) {
        if (target < 0) return;
        else if (target == 0) list.add(new ArrayList<>(temp));
        else {
            for (int i = x; i < candidates.length; i++) {
                temp.add(candidates[i]);
                int y = target - candidates[i];
                backtrack(candidates, y, list, temp, i);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
