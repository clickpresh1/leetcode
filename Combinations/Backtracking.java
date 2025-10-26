class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();

        backtrack(n, k, list, new ArrayList<>(), 1);

        return list;
    } 

    public static void backtrack(int n, int k, List<List<Integer>> list, List<Integer> temp, int x) {
        if (temp.size() == k) {
            list.add(new ArrayList<>(temp));
            return;
        }
        else {
            for (int i = x; i <= n - k + 1; i++) {
                temp.add(i);
                backtrack(n, k, list, temp, i + 1);
                temp.remove(temp.size() - 1);
            }
        }
    }
}
