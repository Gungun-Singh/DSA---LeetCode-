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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> ans = new ArrayList<>();

        String path = Integer.toString(root.val);
        allPath(root, path, ans);

        return ans;
    }

    void allPath(TreeNode root, String path, ArrayList<String> ans) {
        if (root.left == null && root.right == null) {
            ans.add(path);
        }
        if (root.left != null) {
            allPath(root.left, path + "->" + Integer.toString(root.left.val), ans);

        }

        if (root.right != null) {
            allPath(root.right, path + "->" + Integer.toString(root.right.val), ans);
        }
    }
}