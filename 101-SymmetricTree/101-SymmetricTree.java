// Last updated: 04/08/2026, 00:20:27
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
    boolean check(TreeNode r, TreeNode l)
    {
        if(r==null || l == null) return r==l;

        return r.val == l.val && check(r.right, l.left) && check(r.left, l.right);
    }
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return check(root.left, root.right);
    }
}