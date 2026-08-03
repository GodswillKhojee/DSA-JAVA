// Last updated: 03/08/2026, 21:15:05
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
    public TreeNode check(TreeNode root)
    {
        if(root.left == null) return root.right;
        else if(root.right == null) return root.left;
        else
        {
            TreeNode rbeta = root.right;
            TreeNode lastR = findlr(root.left);
            lastR.right = rbeta;
            return root.left;
        }
    }
    public TreeNode findlr(TreeNode root)
    {
        if(root.right == null) return root;
        return findlr(root.right);
    }
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) return null;
        if(root.val == key) return check(root);
        TreeNode dum = root;
        while(root!=null)
        {
            if(root.val > key)
            {
                if(root.left != null && root.left.val == key)
                {
                    root.left = check(root.left);
                    break;
                }
                else root = root.left;
            }
            else
            {
                if(root.right != null && root.right.val == key)
                {
                    root.right = check(root.right);
                    break;
                }
                else root = root.right;
            }
        }
        return dum;
    }
}