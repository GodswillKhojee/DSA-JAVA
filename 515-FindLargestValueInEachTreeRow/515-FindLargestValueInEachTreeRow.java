// Last updated: 03/08/2026, 21:14:58
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
    public List<Integer> largestValues(TreeNode root) {

        List<Integer> ls = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return ls;
        q.add(root);
        while(!q.isEmpty())
        {
            int size = q.size();
            int large = Integer.MIN_VALUE;
            for(int i = 0; i < size;i++)
            {
                TreeNode cur = q.poll();
                if(cur.val > large) large =cur.val;
                if(cur.left != null) q.add(cur.left);
                if(cur.right != null) q.add(cur.right);
            }
            ls.add(large);
        }
        return ls;
    }
}