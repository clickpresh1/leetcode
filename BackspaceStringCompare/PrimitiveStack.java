class Solution {
    public boolean backspaceCompare(String s, String t) {
        int m = s.length(), n = t.length(), top1 = -1, top2 = -1;
        char[] stack1 = new char[m], stack2 = new char[n];

        for (char c : s.toCharArray()) {
            if (c != '#') stack1[++top1] = c;
            else if (top1 != -1) top1--;
        } 

        for (char c : t.toCharArray()) {
            if (c != '#') stack2[++top2] = c;
            else if (top2 != -1) top2--;
        } 

        if (top1 != top2) return false;

        while (top1 >= 0) {
            if (stack1[top1--] != stack2[top2--]) return false;
        }

        return true;
    } 
}
