package binary_tree;

public class preorderTranversal {
    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.right.left = new node(5);
        preorder(root); // this is the preorder recursive method
    }
    public static void preorder(node root)
    {
        if(root == null) return;
        System.out.print(root.data + "->");
        preorder(root.left);
        preorder(root.right);
    }
}
