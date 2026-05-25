package binary_tree;

public class flattenBT {
    static node prev = null;
    public static void flat(node root)
    {
        if(root == null) return;
        flat(root.right);
        flat(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }
    public static void main(String[] args) {
        node root = new node(1);

        root.left = new node(2);
        root.right = new node(5);

        root.left.left = new node(3);
        root.left.right = new node(4);

        root.right.right = new node(6);

        flat(root);
        node temp = root;
        while(temp!=null)
        {
            System.out.print(temp.data +" ");
            temp = temp.right;
        }
    }
}
