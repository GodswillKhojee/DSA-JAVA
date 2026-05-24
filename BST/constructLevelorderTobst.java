package BST;

import binary_tree.node;

public class constructLevelorderTobst {

    static node insert(node root, int key) {

        if (root == null)
            return new node(key);

        if (key < root.data)
            root.left = insert(root.left, key);

        else
            root.right = insert(root.right, key);

        return root;
    }

    static node buildSearchTree(int t[], int n) {

        node root = null;

        for (int i = 0; i < n; i++) {

            root = insert(root, t[i]);
        }

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

        int arr[] = {4, 2, 7, 1, 3, 5, 8};

        node root = buildSearchTree(arr, arr.length);

        inorder(root);
    }
}