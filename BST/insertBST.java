package BST;

import binary_tree.node;

public class insertBST {
    public static node addNew(node root, int val)
    {
        if(root == null) return new node(val);
        node cur = root;
        while(cur != null)
        {
            if(val < cur.data)
            {
                if(cur.right != null) cur = cur.right;
                else
                {
                    cur.right = new node(val);
                    break;
                }
            }
            else
            {
                if(cur.left != null) cur = cur.left;
                else
                {
                    cur.left = new node(val);
                    break;
                }
            }
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
        System.out.println(addNew(root,11).data);
    }
}
