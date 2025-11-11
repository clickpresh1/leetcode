/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (((p == null) && (q != null)) || ((p != null) && (q == null))) return false;
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        TreeNode r = p;
        TreeNode s = q;

        while (((r != null) || (!(stack1.isEmpty()))) && ((s != null) || (!(stack2.isEmpty())))) {
            while ((r != null) && (s != null)) {
                stack1.push(r);
                stack2.push(s);
                r = r.left;
                s = s.left;
                if (((r == null) && (s != null)) || ((r != null) && (s == null))) return false;
            } 

            r = stack1.pop();
            s = stack2.pop();
            if (r.val != s.val) return false;
            r = r.right;
            s = s.right;
            if (((r == null) && (s != null)) || ((r != null) && (s == null))) return false;
        } 
        return true;
    } 
} 
