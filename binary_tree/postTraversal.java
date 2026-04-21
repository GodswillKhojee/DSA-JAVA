package binary_tree;

import java.util.*;
public class postTraversal {
    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.right.left = new node(5);
        System.out.println(post(root));
    }
    public static List<Integer> post(node root)
    {
        List<Integer> ans = new LinkedList<>();
        if(root == null) return ans;
        ans.addAll(post(root.left));
        ans.addAll(post(root.right));
        ans.add(root.data);
        return ans;
    }
}
