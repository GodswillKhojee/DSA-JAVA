// Last updated: 03/08/2026, 21:16:08
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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        check(root, 0, res);
        return res;
    }
    void check(TreeNode root, int len, List<Integer>res)
    {
        if(root == null) return;
        if(len == res.size()) res.add(root.val);
        check(root.right, len+1, res);
        check(root.left, len+1,res);
    }
}