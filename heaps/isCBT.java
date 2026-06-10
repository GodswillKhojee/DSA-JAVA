package heaps;


import binary_tree.node;

public class isCBT {
    static int s = 0;
    public static boolean isCompleteTree(node root) {
        s = size(root);
        return check(root,1);
    }
    public static boolean check(node root, int idx)
    {
        if(root == null) return true;
        if(idx > s) return false;
        return check(root.left, 2*idx) && check(root.right,2*idx+1);
    }
    public static int size(node root)
    {
        if(root == null) return 0;
        return 1 + size(root.left)+size(root.right);
    }
    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.left.left = new node(4);
        root.left.right = new node(5);
        root.right.left = new node(6);
        if(isCompleteTree(root)) System.out.println("yes");
        else System.out.println("no");
    }
}
