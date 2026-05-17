package BST;

import binary_tree.node;

public class deleteNode {
    public static node check(node root)
    {
        if(root.right == null) return root.left;
        if(root.left == null) return root.right;
        else
        {
            node rightbeta = root.right;
            node lastr = findlr(root.left);
            lastr.right = rightbeta;
            return root.left;
        }
    }
    public static node findlr(node root)
    {
        if(root.right == null) return root;
        return findlr(root.right);
    }
    public static node delete(node root, int key)
    {
        if(root == null) return null;
        if(root.data == key) return check(root);
        node dum = root;
        while(dum  != null)
        {
            if(dum.data > key)
            {
                if(dum.left != null && dum.left.data == key)
                {
                    dum.left = check(dum.left);
                    break;
                }
                else dum = dum.left;
            }
            else
            {
                if(dum.right != null && dum.right.data == key)
                {
                    dum.right = check(dum.right);
                    break;
                }
                else dum = dum.right;
            }
        }
        return root;
    }
    public static void main(String[] args)
    {
        node root = new node(5);

        root.left = new node(3);
        root.right = new node(6);

        root.left.left = new node(2);
        root.left.right = new node(4);

        root.right.right = new node(7);
        System.out.println(delete(root,2).data);
    }
}
