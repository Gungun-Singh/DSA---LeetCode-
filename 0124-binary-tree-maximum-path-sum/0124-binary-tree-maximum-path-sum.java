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
    int max_sum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {

       solve(root);
       return max_sum;

    }
     int solve(TreeNode root){
        if(root == null){
            return 0;
        }
            int l = solve(root.left);
            int r = solve(root.right);
            
        int lower = l+r+root.val;
        int anyOne = Math.max(l,r)+ root.val;
        int onlyOne = root.val;

        max_sum = Math.max(
              Math.max(lower, anyOne),
              Math.max(onlyOne, max_sum)
          );
        return Math.max(anyOne, onlyOne);
     }

}