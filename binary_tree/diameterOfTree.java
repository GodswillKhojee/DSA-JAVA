package binary_tree;

public class diameterOfTree {
    static int diameter = 0;
    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.right.left = new node(5);
        System.out.println(diameterOfBinaryTree(root));
    }
    public static int diameterOfBinaryTree(node root) {
        check(root);
        return diameter;
    }
    public static int check( node root)
    {
        if(root == null) return 0;
        int l = check(root.left);
        int r = check(root.right);

        diameter = Math.max(diameter,l+r);
        return Math.max(l,r)+1;
    }
}
