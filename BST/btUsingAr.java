package BST;

import binary_tree.node;

public class btUsingAr {
    static node check(int [] arr, int i, int n )
    {
        if(i>=n) return null;

        node root = new node(arr[i]);

        root.left = check(arr, 2*i+1, n);
        root.right = check(arr, 2*i+2,n);

        return root;
    }
    static node buildTree(int arr[], int n) {
        return check(arr, 0, n);
    }
    public static void main(String[] args) {

    }
}
