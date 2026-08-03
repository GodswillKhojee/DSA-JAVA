// Last updated: 04/08/2026, 00:20:12
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
    int maxi = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        check(root);
        return maxi;
    }
    public int check(TreeNode root)
    {
        if(root == null) return 0;
        int l = Math.max(0,check(root.left));
        int r = Math.max(0,check(root.right));

        maxi = Math.max(maxi, l+r+root.val);
        return Math.max(l,r)+root.val;
    }
}