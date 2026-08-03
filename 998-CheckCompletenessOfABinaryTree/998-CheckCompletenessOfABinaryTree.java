// Last updated: 03/08/2026, 21:14:26
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
    int s = 0;
    public boolean isCompleteTree(TreeNode root) {
        s = size(root);
        return check(root,1);
    }
    public boolean check(TreeNode root, int idx)
    {
        if(root == null) return true;
        if(idx > s) return false;
        return check(root.left, 2*idx) && check(root.right,2*idx+1);
    }
    public int size(TreeNode root)
    {
        if(root == null) return 0;
        return 1 + size(root.left)+size(root.right);
    }
}