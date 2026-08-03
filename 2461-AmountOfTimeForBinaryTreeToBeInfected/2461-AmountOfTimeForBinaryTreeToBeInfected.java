// Last updated: 03/08/2026, 21:13:33
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
 class Pair{
    TreeNode node;
    int time;
    Pair(TreeNode node, int time)
    {
        this.node = node;
        this.time = time;
    }
 }
class Solution {
    HashMap<TreeNode,TreeNode> parent;
    TreeNode first;
    public int amountOfTime(TreeNode root, int start) {
        parent = new HashMap<>();
        first = null;
        dfs(root, start);
        Queue<Pair> q = new LinkedList<>();
        HashSet<TreeNode> burned = new HashSet<>();
        burned.add(first);
        q.add(new Pair(first,0));
        int maxTime = 0;
        while(!q.isEmpty())
        {
            Pair front = q.poll();
            TreeNode node = front.node;
            int time = front .time;
            maxTime = Math.max(maxTime, time);
            if(node.left != null && !burned.contains(node.left))
            {
                q.add(new Pair(node.left,time+1));
                burned.add(node.left);
            }
            if(node.right != null && !burned.contains(node.right))
            {
                q.add(new Pair(node.right,time+1));
                burned.add(node.right);
            }
            
            if(parent.containsKey(node) && !burned.contains(parent.get(node)))
            {
                q.add(new Pair(parent.get(node),time+1));
                burned.add(parent.get(node));
            }
        }
        
        return maxTime;

    }
    public void dfs(TreeNode root, int start)
    {
        if(root == null) return;
        if(root.val == start) first = root;
        if(root.left != null) parent.put(root.left,root);
        if(root.right != null) parent.put(root.right,root);
        dfs(root.left,start);
        dfs(root.right,start);
    } 
}