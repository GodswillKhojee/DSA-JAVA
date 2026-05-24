package BST;

import binary_tree.node;

public class contructFromPreorder {

    public static node bstFromPreorder(int[] preorder) {

        return check(preorder, Integer.MAX_VALUE, new int[]{0});
    }

    public static node check(int[] preorder, int bound, int[] i) {

        if (i[0] == preorder.length || preorder[i[0]] > bound)
            return null;

        node root = new node(preorder[i[0]++]);

        root.left = check(preorder, root.data, i);

        root.right = check(preorder, bound, i);

        return root;
    }

    static void inorder(node root) {

        if (root != null) {

            inorder(root.left);

            System.out.print(root.data + " ");

            inorder(root.right);
        }
    }

    public static void main(String[] args) {

        int preorder[] = {8, 5, 1, 7, 10, 12};


        node root = bstFromPreorder(preorder);

        inorder(root);
    }
}