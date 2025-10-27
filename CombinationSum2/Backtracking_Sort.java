class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();

        backtrack(candidates, target, list, new ArrayList<>(), 0);

        return list;
    } 

    public static void backtrack(int[] candidates, int target, List<List<Integer>> list, List<Integer> temp, int x) {
        if (target < 0) return;
        else if ((target == 0)) list.add(new ArrayList<>(temp));
        else {
            int L = -1;
            for (int i = x; i < candidates.length; i++) {
                if (L == candidates[i]) continue;
                temp.add(candidates[i]);
                int y = target - candidates[i];
                backtrack(candidates, y, list, temp, i + 1);
                temp.remove(temp.size() - 1);
                L = candidates[i];
            }
        }
    }
}
