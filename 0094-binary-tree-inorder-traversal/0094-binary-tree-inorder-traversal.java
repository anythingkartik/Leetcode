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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        inOrder(root, list);
        return list;
    }


        private void inOrder(TreeNode root, List<Integer> list) {
            if(root==null) {
                return;
            }
            inOrder(root.left, list);         // Step 1: Left subtree
            list.add(root.val);               // Step 2: Visit current node (root)
            inOrder(root.right, list);   
        }
}