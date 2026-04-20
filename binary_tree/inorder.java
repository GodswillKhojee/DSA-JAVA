package binary_tree;


public class inorder {
    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.right.left = new node(5);
        InorderTranversal(root);
    }
    public static void InorderTranversal(node root)
    {
        if(root == null) return;
        InorderTranversal(root.left);
        System.out.print(root.data+"->");
        InorderTranversal(root.right);
    }
}
