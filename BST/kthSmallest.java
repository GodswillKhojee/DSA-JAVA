package BST;
import java.util.*;
import binary_tree.node;

public class kthSmallest {
    public static void inOrderTrav(node root, List<Integer> list)
    {
        if(root != null)
        {
            inOrderTrav(root.left, list);
            list.add(root.data);
            inOrderTrav(root.right,list);
        }
    }
    public static int kthSmallest(node root, int k) {
        List<Integer> list = new ArrayList<>();
        inOrderTrav(root, list);
        System.out.println(list);
        return list.get(k-1);
    }
    public static void main(String[] args) {
        node root = new node(5);

        root.left = new node(3);
        root.right = new node(6);

        root.left.left = new node(2);
        root.left.right = new node(4);

        root.right.left = new node(7);
//        root.right.right = new node(10);
        System.out.println(kthSmallest(root,1));
    }
}
