/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    HashMap<TreeNode, TreeNode> map = new HashMap<>();

    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        inorder(root);
        bfs(target, k, list);

        return list;
    }

    void inorder(TreeNode root) {
        if (root == null) {
            return;
        }

        if (root.left != null) {
            map.put(root.left, root);

        }
        inorder(root.left);

        if (root.right != null) {
            map.put(root.right, root);
        }
        inorder(root.right);
    }

    void bfs(TreeNode target, int k, ArrayList<Integer> list) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(target);

        HashSet<Integer> set = new HashSet<>();
        set.add(target.val);

        while (!q.isEmpty()) {
            int n = q.size();
            if (k == 0) {
                break;
            }
            while (n-- >0) {
            TreeNode curr = q.poll();

            //left
            if(curr.left != null && !set.contains(curr.left.val)){
                q.add(curr.left);
                set.add(curr.left.val);
            }
            //right
            if(curr.right != null && !set.contains(curr.right.val)){
                q.add(curr.right);
                set.add(curr.right.val);
            }
            //parent
            if(map.containsKey(curr) && !set.contains(map.get(curr).val)){
                q.add(map.get(curr));
                set.add(map.get(curr).val);
            }
            }
            k--;
        }
        while(!q.isEmpty()){
            TreeNode temp = q.poll();
            list.add(temp.val);
        }

    }
}