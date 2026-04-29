package binary_tree;

public class balancedTree {
    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.right.left = new node(5);
        System.out.println(isBalanced(root));
    }
    public static boolean isBalanced(node root) {
        return check(root) != -1;
    }
    public static int check(node root)
    {
        if(root == null) return 0;
        // simple check of unbalance
        int l = check(root.left);
        if(l == -1) return -1;
        int r = check(root.right);
        if(r == -1) return -1;

        if(Math.abs(l-r) > 1) return -1;

        return Math.max(l,r) +1;
    }


    // it was my approach
    /*
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        if (Math.abs(check(root.left) - check(root.right)) <= 1 &&
            isBalanced(root.left) &&
            isBalanced(root.right))

            {
                return true;
            }
            return false;

        }
    public int check(TreeNode root)
    {
        if(root == null) return 0;

        int l = check(root.left);
        int r = check(root.right);

        return Math.max(l,r)+1;
    }
    */
}
