package BST;

import binary_tree.node;

public class ValidBST {
    public static boolean isBST(node root)
    {
        return check(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    public static boolean check(node root, long min, long max)
    {
        if(root == null) return true;
        if(root.data <= min || root.data >= max) return false;
        return check(root.left, min, root.data) && check(root.right, root.data, max);
    }
    public static void main(String[] args) {
        node root = new node(5);

        root.left = new node(3);
        root.right = new node(8);

        root.left.left = new node(2);
        root.left.right = new node(4);

        root.right.left = new node(6);
        root.right.right = new node(10);
        System.out.println(isBST(root));
    }
}
