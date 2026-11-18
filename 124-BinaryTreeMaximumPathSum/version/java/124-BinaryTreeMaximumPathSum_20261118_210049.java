// Last updated: 18/11/2026, 21:00:49
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
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        solve(root);
        return max;
    }
    int solve(TreeNode root)
    {
        if(root == null) return 0;
        int l = Math.max(0,solve(root.left));
        int r = Math.max(0,solve(root.right));

        max = Math.max(max, l+r+root.val);
        return Math.max(l,r)+root.val;
    }
}