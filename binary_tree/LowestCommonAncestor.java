package binary_tree;

public class LowestCommonAncestor {
    public static node lca(node root, node p, node q) {
        if (root == null || root == p || root == q) return root;

        // left and right;
        node l = lca(root.left, p, q);
        node r = lca(root.right, p, q);

        if (l == null) return r;
        else if (r == null) return l;
        else return root;
    }
    public static void main(String[] args) {
        node root = new node(3);

        root.left = new node(5);
        root.right = new node(1);

        root.left.left = new node(6);
        root.left.right = new node(2);

        root.right.left = new node(0);
        root.right.right = new node(8);

        root.left.right.left = new node(7);
        root.left.right.right = new node(4);
        System.out.println(lca(root,root.left.left,root.left.right.right).data);
    }
}
