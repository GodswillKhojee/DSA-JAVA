package binary_tree;

public class maxSumBT {
    public static void main(String[] args) {
        node root = new node(-10);
        root.left = new node(9);
        root.right = new node(20);
        root.right.left = new node(15);
        root.right.right = new node(7);
        System.out.println(maxPath(root));
    }
    static int maxi = Integer.MIN_VALUE;
    public static int maxPath(node root)
    {
        check(root);
        return maxi;
    }
    public static int check(node root)
    {
        if(root == null) return 0;
        int l = Math.max(0,check(root.left));
        int r = Math.max(0,check(root.right));

        maxi = Math.max(maxi,l+r+root.data);
        return Math.max(l,r)+root.data;
    }
}
