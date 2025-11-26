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
    public boolean isValidBST(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isValid(root, null, null);
    }

    boolean isValid(TreeNode root, TreeNode mini, TreeNode maxi) {
        if (root == null) {
            return true;
        }

        if (mini != null && root.val <= mini.val) {
            return false;
        }
        if (maxi != null && root.val >= maxi.val) {
            return false;
        }

        return isValid(root.left, mini, root) && isValid(root.right, root, maxi);
    }
}