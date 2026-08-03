// Last updated: 04/08/2026, 00:20:24
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
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean LR = true;
        while(!q.isEmpty())
        {
            int size = q.size();
            List<Integer> ls = new ArrayList<>(Collections.nCopies(size, 0));
            for(int i = 0;i<size;i++)
            {
                TreeNode node = q.poll();
                int idx = LR ? i : size-1-i;
                ls.set(idx , node.val);
                if(node.left != null) q.offer(node.left);
                if(node.right != null) q.offer(node.right);
            }
            LR = !LR;
            result.add(ls);
        }
        return result;
    }
}