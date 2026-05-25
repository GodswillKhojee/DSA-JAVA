package binary_tree;

public class countNode {
    static int count = 0;
    public static void check(node root)
    {
        if(root == null) return;
        check(root.left);
        count++;
        check(root.right);
    }
    public static int countNodes(node root) {
        check(root);
        return count;
    }
    public static void main(String[] args) {
        node root = new node(1);

        root.left = new node(2);
        root.right = new node(3);

        root.left.left = new node(4);
        root.left.right = new node(5);

        root.right.left = new node(6);
        root.right.right = new node(7);
        System.out.println(countNodes(root));
    }
}
