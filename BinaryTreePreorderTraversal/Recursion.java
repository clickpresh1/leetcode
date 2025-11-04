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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        traverse(list, root);

        return list;
    } 

    public static void traverse(List<Integer> list, TreeNode root) {
        if (root != null) {
            list.add(root.val);
            traverse(list, root.left);
            traverse(list, root.right);
        }
    }
}
