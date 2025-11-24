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
        if(root == null){
            return true;
        }

        return check(root.left, root.right);
    }

    boolean check(TreeNode p, TreeNode r ){
        if(p == null && r == null){
            return true;
        }
        if(p== null || r == null){
            return false;
        }

        if(p.val == r.val && check(p.left, r.right) && check(p.right, r.left)){
            return true;
        }
        return false;
    }
}