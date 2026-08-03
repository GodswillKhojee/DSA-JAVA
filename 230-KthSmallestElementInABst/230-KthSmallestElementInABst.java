// Last updated: 03/08/2026, 21:15:54
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
    public void inOrderTrav(TreeNode root, List<Integer> list)
    {
        if(root != null)
        {
            inOrderTrav(root.left, list);
            list.add(root.val);
            inOrderTrav(root.right,list);
        }
    }
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inOrderTrav(root, list);
        // Collections.sort(list);
        return list.get(k-1);
    }
}