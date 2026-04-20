package binary_tree;

public class preorderTranversal {
    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.right.left = new node(5);
        System.out.println(root.data);
    }
    public static void preorder(node root)
    {
        if(root == null) return;
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
}
