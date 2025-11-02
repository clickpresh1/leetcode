class Solution {
    public boolean checkPowersOfThree(int n) {
        List<Integer> list = new ArrayList<>();
        list.add(1);

        int y = 3;

        while ((n / y) >= 1) {
            list.add(y);
            y *= 3;
        } 

        return backtrack(n, list, 0, 0, new ArrayList<>());
    } 

    public static boolean backtrack(int n, List<Integer> list, int sum, int idx, List<Integer> temp) {
        if (sum == n) return true;
        if ((sum > n) || (idx >= list.size())) return false;
        for (int i = idx; i < list.size(); i++) {
            int z = list.get(i);
            temp.add(z);
            sum += z;
            if (backtrack(n, list, sum, i + 1, temp)) return true;
            sum -= z;
            temp.remove(temp.size() - 1);
        } 

        return false;
    }
}
