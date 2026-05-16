package BST;

import binary_tree.node;

public class ceil {
    public static int findceil(node root , int x)
    {
        int ceil = -1;
        while(root != null)
        {
            if(root.data == x) return root.data;
            if(x > root.data) root = root.right;
            else
            {
                ceil = root.data;
                root = root.left;
            }
        }
        return ceil;
    }
    public static void main(String[] args) {
        node root = new node(5);

        root.left = new node(3);
        root.right = new node(8);

        root.left.left = new node(2);
        root.left.right = new node(4);

        root.right.left = new node(6);
        root.right.right = new node(10);
        System.out.println(findceil(root, 6));
    }
}
