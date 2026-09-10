// Last updated: 10/09/2026, 20:59:16
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
    int count = 0;
    public int[]  helper(TreeNode root)
    {
        if(root == null) return new int[]{0,0};
        int [] l = helper(root.left);
        int [] r = helper(root.right);

        int size = 1 + l[1] + r[1];
        int sum = root.val + l[0]+r[0];

        if(root.val == sum/size) count++;

        return new int[]{sum,size}; 
    }
    
    public int averageOfSubtree(TreeNode root) {
        helper(root);
        return count;
    }
}