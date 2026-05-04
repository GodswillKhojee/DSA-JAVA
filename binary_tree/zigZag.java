package binary_tree;

import com.sun.source.tree.Tree;

import java.util.*;
public class zigZag {
    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.right.left = new node(5);
        System.out.println(zz(root));
    }
    public static List<List<Integer>> zz(node root)
    {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;

        Queue<node> q = new LinkedList<>();
        q.offer(root);
        Boolean LR = true;
        while(!q.isEmpty())
        {
            int size = q.size();
            List<Integer> ls = new ArrayList<>(Collections.nCopies(size,0));
            for (int i = 0 ; i < size;i++)
            {
                node n = q.poll();
                int idx = LR ? i:size-1-i;
                ls.set(idx,n.data);
                if(n.left != null) q.offer(n.left);
                if(n.right != null) q.offer(n.right);
            }
            LR = !LR;
            result.add(ls);
        }
        return result;
    }
}
