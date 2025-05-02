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
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0; // empty tree
        }

        int leftDepth = maxDepth(root.left);  // get depth of left child
        int rightDepth = maxDepth(root.right); // get depth of right child

        return 1 + Math.max(leftDepth, rightDepth); // add 1 for the current node

    }
   
}