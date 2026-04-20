package binary_tree;

public class postTraversal {
    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.right.left = new node(5);
        post(root);
    }
    public static void post(node root)
    {
        if(root == null) return;
        post(root.left);
        post(root.right);
        System.out.print(root.data+"->");
    }
}
