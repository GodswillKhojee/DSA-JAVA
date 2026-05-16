package BST;

import binary_tree.node;

public class searchBST {
    public static node searchBST(node root, int tar)
    {
        while(root!=null && root.data != tar)
        {
            root = tar < root.data ? root.left : root.right;
        }
        return root;
    }
    public static void main(String[] args) {
        node root = new node(1);

        root.left = new node(2);
        root.right = new node(3);

        root.left.left = new node(4);
        root.left.right = new node(5);

        root.right.left = new node(6);
        root.right.right = new node(10);
        System.out.println(searchBST(root,10).data);
    }
}
