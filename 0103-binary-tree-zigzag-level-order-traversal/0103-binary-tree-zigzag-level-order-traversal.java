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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int k = -1;

        while (!q.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            int n = q.size();

            for (int i = 0; i < n; i++) {
                TreeNode temp = q.poll();

                list.add(temp.val);

                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }
            k++;
            if (k % 2 == 0) {
                ans.add(list);
            } else if (k % 2 != 0) {
                Collections.reverse(list);
                ans.add(list);
            }

        }
        return ans;
    }
}