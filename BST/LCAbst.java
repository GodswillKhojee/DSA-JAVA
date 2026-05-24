package BST;

import binary_tree.node;

public class LCAbst {
    public static node lowestComAns(node root, node p1,node p2)
    {
        if(root == null) return null;
        int cur = root.data;
        if(cur < p1.data && cur < p2.data) return lowestComAns(root.right, p1,p2);
        if(cur > p1.data && cur > p2.data) return lowestComAns(root.left, p1, p2);

        return root;
    }
    public static void main(String[] args) {
        node root = new node(5);

        root.left = new node(3);
        root.right = new node(8);

        root.left.left = new node(2);
        root.left.right = new node(4);

        root.right.left = new node(6);
        root.right.right = new node(10);
        System.out.println(lowestComAns(root,root.left.left,root.right.left).data);
    }
}
