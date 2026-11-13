// Last updated: 13/11/2026, 20:59:38
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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> outer = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return outer;
        q.add(root);
        while(!q.isEmpty())
        {
            int qSize = q.size();
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i < qSize;i++)
            {
                TreeNode cur = q.remove();
                temp.add(cur.val);
                if(cur.left != null) q.add(cur.left);
                if(cur.right != null) q.add(cur.right);
            }
            outer.add(temp);
        }
        return outer;
    }
}