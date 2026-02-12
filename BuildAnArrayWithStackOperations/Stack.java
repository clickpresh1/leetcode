class Solution {
    public List<String> buildArray(int[] target, int n) {
        int m = target.length, y = target[m - 1], top = 0;
        Stack<Integer> stack = new Stack<>();
        List<String> list = new ArrayList<>();
        String s = "Push", t = "Pop";

        for (int i = 1; i < n + 1; i++) {
            stack.push(i);
            list.add(s);

            if (i != target[top]) {
                stack.pop();
                list.add(t);
            } else top++;

            if (i == y) return list;
        } 

        return list;
    }
}
