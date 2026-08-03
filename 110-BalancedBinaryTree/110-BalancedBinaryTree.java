// Last updated: 04/08/2026, 00:20:17
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
    public boolean isBalanced(TreeNode root) {
        return check(root) != -1;
    }

    public int check(TreeNode root)
    {
        if(root == null) return 0; // if null return zero
        
        int l = check(root.left);
        if(l==-1) return -1;

        int r = check(root.right);
        if(r==-1) return -1;

        if(Math.abs(l-r) > 1) return -1;
        //till here we are checking if balance

        return Math.max(l,r)+1;
    }
}