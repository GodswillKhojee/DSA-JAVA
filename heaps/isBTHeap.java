package heaps;

import binary_tree.node;

public class isBTHeap {
    static int s = 0;
    public static int size(node root)
    {
        if(root == null) return 0;
        return 1 + size(root.left)+size(root.right);
    }
    public static boolean isMaxHeap(node root)
    {
        if(root == null) return true;
        int leftVal = (root.left != null) ? root.left.data :Integer.MIN_VALUE;
        int rightVal = (root.right != null) ? root.right.data : Integer.MIN_VALUE;
        if(root.data <= leftVal || root.data <= rightVal) return false;
        return isMaxHeap(root.left) && isMaxHeap(root.right);
    }
    public static boolean isCBT(node root, int idx)
    {
        if(root == null) return true;
        if(idx>s) return false;
        return isCBT(root.left,2*idx) && isCBT(root.right,2*idx+1);
    }
    public static boolean isHeap(node tree) {
        // code here
        s = size(tree);
        return isMaxHeap(tree) && isCBT(tree,1);
    }
    public static void main(String[] args) {
        node root = new node(10);
        root.left = new node(9);
        root.right = new node(8);
        root.left.left = new node(7);
        root.left.right = new node(6);
        root.right.left = new node(5);

        System.out.println(isHeap(root));
    }
}
