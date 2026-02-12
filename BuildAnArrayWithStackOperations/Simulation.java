class Solution {
    public List<String> buildArray(int[] target, int n) {
        int m = target.length, y = target[m - 1], top = 0;
        List<String> list = new ArrayList<>();
        String s = "Push", t = "Pop";

        for (int i = 1; i < n + 1; i++) {
            list.add(s);

            if (i != target[top]) list.add(t);
            else top++;

            if (i == y) return list;
        } 

        return list;
    }
}
