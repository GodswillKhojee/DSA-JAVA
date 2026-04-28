package binary_tree;
import java.util.*;
public class preorderTranversal {
    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.right.right = new node(5);
        System.out.println(preorder(root)); // this is the preorder recursive method

    }
    public static List<Integer> preorder(node root)
    {
        List<Integer> ans = new LinkedList<>();
        if(root == null) return ans;
        ans.add(root.data);
        ans.addAll(preorder(root.left));
        ans.addAll(preorder(root.right));
        return ans;
    }
}
