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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return recur(root.left, root.right);
    }
    boolean recur(TreeNode left, TreeNode right) {
        if (left == null && right == null) {
            return true;
        } else if (left != null && right != null && left.val == right.val) {
            return recur(left.left, right.right) && recur (left.right, right.left);
        } else {
            return false;
        }


        
        // if (left == null && right == null) {
        //     return true;
        // }
        // if (left == null || right == null) {
        //     return false;
        // }
        // if (left.val != right.val ) {
        //     return false;
        // }
        // return recur(left.left, right.right) && recur(left.right, right.left);
    }
}
