package binary_tree;

public class symTree {
    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(2);
//        root.right.left = new node(5);
        System.out.println(isSymmetric(root));
    }
    static boolean check(node r, node l)
    {
        if(r==null || l == null) return r==l;

        return r.data == l.data && check(r.right, l.left) && check(r.left, l.right);
    }
    public static boolean isSymmetric(node root) {
        if(root == null) return true;
        return check(root.left, root.right);
    }
}

