package binary_tree;

public class sameTree {
    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.right.left = new node(5);

        node root1 = new node(1);
        root1.left = new node(2);
        root1.right = new node(5);
        root1.right.left = new node(5);
        System.out.println(isSameTree(root, root1));
    }
    public static boolean isSameTree(node p, node q) {
        if(q == null || p == null) return p==q;

        return (q.data == p.data ) && isSameTree(q.left ,p.left) && isSameTree(q.right , p.right);
    }
}
