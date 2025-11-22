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
    public int sumOfLeftLeaves(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();

        int sum = 0;

        stack.push(root);

        while (!(stack.isEmpty())) {
            TreeNode curr = stack.pop();

            if (curr.right != null) {
                stack.push(curr.right);
            } 

            if (curr.left != null) {
                stack.push(curr.left);

                if ((curr.left.left == null) && (curr.left.right == null)) {
                    sum += curr.left.val;
                }
            } 
        } 

        return sum;
    }
}
