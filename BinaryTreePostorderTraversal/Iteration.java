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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        if (root == null) return list;

        stack.push(root);

        while (!(stack.isEmpty())) {
            TreeNode curr = stack.peek();

            if ((curr.left == null) && (curr.right == null)) {
                list.add(stack.pop().val);

            } 

            if (curr.right != null) {
                stack.push(curr.right);
                curr.right = null;
            } 

            if (curr.left != null) {
                stack.push(curr.left);
                curr.left = null;
            }
        } 

        return list;
    }
}
