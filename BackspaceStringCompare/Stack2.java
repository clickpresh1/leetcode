class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> q1 = new Stack<>(), q2 = new Stack<>();

        char[] a = s.toCharArray(), b = t.toCharArray();

        int m = a.length, n = b.length;

        for (int i = 0; i < m; i++) {
            if (a[i] != '#') q1.push(a[i]);
            else if (!q1.isEmpty()) q1.pop();
        }

        for (int i = 0; i < n; i++) {
            if (b[i] != '#') q2.push(b[i]);
            else if (!q2.isEmpty()) q2.pop();
        }

        if (q1.size() != q2.size()) return false;

        int k = q1.size();

        for (int i = 0; i < k; i++) {
            if (q1.pop() != q2.pop()) return false;
        } 

        return true;
    } 
}
