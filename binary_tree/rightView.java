package binary_tree;

import java.util.*;

public class rightView {
    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.right.left = new node(5);
        System.out.println(rightSideView(root));
    }
    public static List<Integer> rightSideView(node root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        check(root, 0, res);
        return res;
    }
    static void check(node root, int len, List<Integer>res)
    {
        if(root == null) return;
        if(len == res.size()) res.add(root.data);
        check(root.right, len+1, res);
        check(root.left, len+1,res);
    }
}
