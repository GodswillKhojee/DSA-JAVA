package BST;

import binary_tree.node;

public class floor {
    public static int findfloor(node root, int k)
    {
        int floor = -1;
        while(root!=null)
        {
            if(root.data == k) return root.data;

            if(k < root.data) root = root.left;
            else
            {
                floor = root.data;
                root = root.right;
            }
        }
        return floor;
    }
    public static void main(String[] args) {
        node root = new node(5);

        root.left = new node(3);
        root.right = new node(8);

        root.left.left = new node(2);
        root.left.right = new node(4);

        root.right.left = new node(6);
        root.right.right = new node(10);
        System.out.println(findfloor(root, 7));
    }
}
