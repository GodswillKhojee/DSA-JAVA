package binary_tree;


import java.util.LinkedList;
import java.util.List;

public class inorder {
    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.right.left = new node(5);
        System.out.println(InorderTranversal(root));
    }
    public static List<Integer> InorderTranversal(node root)
    {
        List<Integer> ans = new LinkedList<>();
        if(root == null) return ans;
        ans.addAll(InorderTranversal(root.left));
        ans.add(root.data);
        ans.addAll(InorderTranversal(root.right));
        return ans;
    }
}
