// Last updated: 18/11/2026, 13:20:09
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
    void solve(TreeNode root, int target,List<List<Integer>> outer,List<Integer> ans)
    {
        if(root == null) return;
        
        ans.add(root.val);
        target -= root.val;

        if(root.left == null && root.right == null && target == 0) {
            outer.add(new ArrayList<>(ans));
        }
        solve(root.left,target,outer,ans);
        solve(root.right,target,outer,ans);

        ans.remove(ans.size() - 1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> outer = new ArrayList<>();
        if(root == null) return outer;
        List<Integer> ans = new ArrayList<>();
        solve(root,targetSum,outer,ans);
        return outer;
    }
}