// Last updated: 04/08/2026, 00:20:26
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
        List<List<Integer>> bigList = new LinkedList<>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        if(root == null) return bigList;
        q.add(root);
        while(!q.isEmpty())
        {
            int levelSize = q.size();
            List<Integer> innerList = new ArrayList<>();
            for(int i = 0; i < levelSize;i++)
            {
                if(q.peek().left != null) q.add(q.peek().left);
                if(q.peek().right != null) q.add(q.peek().right);
                innerList.add(q.poll().val);
            }
            bigList.add(innerList);
         }
         return bigList;
    }
}