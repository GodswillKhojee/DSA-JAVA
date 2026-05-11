package binary_tree;

public class isFoldable {
    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
//        root.right.left = new node(5);
        System.out.println(isFoldable(root));
    }
    static int isFoldable(node root) {
        // Write your code here
        if(root == null) return 1;
        if(check(root.left,root.right)) return 1;
        else return 0;
    }
    static boolean check(node l, node r)
    {
        if(l == null || r == null) return l==r;

        return(check(l.left, r.right) && check(l.right , r.left));
    }
}
