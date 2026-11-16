// Last updated: 16/11/2026, 20:46:54
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
    void solver(TreeNode root, List<Integer> ans, int level)
    {
        if(root == null) return;
        if(level == ans.size()) ans.add(root.val);
        solver(root.right,ans, level+1);
        solver(root.left,ans,level+1);

    }
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        int level = 0;
        solver(root, ans, level);
        return ans;
    }
}