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
    public int getMinimumDifference(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null) {
            return -1;
        }

        iot(root, ans);

        int mini = Integer.MAX_VALUE;
        for (int i = 1; i < ans.size(); i++) {
            int minimum = ans.get(i) - ans.get(i - 1);
            if (minimum < mini) {
                mini = minimum;

            }
        }
        return mini;
    }

    void iot(TreeNode root, ArrayList<Integer> ans) {
        if (root == null) {
            return;
        }

        iot(root.left, ans);
        ans.add(root.val);
        iot(root.right, ans);

    }
}