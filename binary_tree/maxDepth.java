package binary_tree;

public class maxDepth {
    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.right.left = new node(5);
        System.out.println(maxdepth(root));
    }
    public static int maxdepth(node root) {
        if(root == null) return 0;
        int l = maxdepth(root.left);
        int r = maxdepth(root.right);
        return Math.max(l,r)+1;
    }
}
