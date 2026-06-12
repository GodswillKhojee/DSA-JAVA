package heaps;

import binary_tree.node;
import java.util.ArrayList;

public class fromBstToHeap {

    static int idx;

    public static void convertToMaxHeapUtil(node root) {
        idx = 0;

        ArrayList<Integer> inorderList = new ArrayList<>();

        inorder(root, inorderList);

        idx = 0;
        postorder(root, inorderList);
    }

    public static void inorder(node root, ArrayList<Integer> in) {
        if (root == null)
            return;

        inorder(root.left, in);
        in.add(root.data);
        inorder(root.right, in);
    }

    public static void postorder(node root, ArrayList<Integer> in) {
        if (root == null)
            return;

        postorder(root.left, in);
        postorder(root.right, in);

        root.data = in.get(idx++);
    }

    public static void preorder(node root) {
        if (root == null)
            return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {

        /*
                 4
               /   \
              2     6
             / \   / \
            1   3 5   7
        */

        node root = new node(4);
        root.left = new node(2);
        root.right = new node(6);
        root.left.left = new node(1);
        root.left.right = new node(3);
        root.right.left = new node(5);
        root.right.right = new node(7);

        convertToMaxHeapUtil(root);

        System.out.println("Preorder traversal of Max Heap:");
        preorder(root);
    }
}