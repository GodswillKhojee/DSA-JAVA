package binary_tree;

import java.util.*;


public class boundaryTraversal {
    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.right.left = new node(5);
        System.out.println(boundaryTrav(root));
    }

    static boolean isLeaf(node root)
    {
        return root.left == null && root.right == null;
    }

    static ArrayList<Integer> addleft(node root, ArrayList<Integer> res)
    {
        node cur = root.left;
        while(cur != null)
        {
            if(!isLeaf(cur))
            {
                res.add(cur.data);
            }

            if(cur.left != null) cur = cur.left;
            else cur = cur.right;
        }
        return res;
    }
    static ArrayList<Integer> addright(node root, ArrayList<Integer> res)
    {
        node cur = root.right;
        List<Integer> temp = new ArrayList<>();
        while(cur != null)
        {
            if(!isLeaf(cur))
            {
                temp.add(cur.data);
            }

            if(cur.right != null) cur = cur.right;
            else cur = cur.left;
        }

        for(int i = temp.size()-1; i>=0;i--)
        {
            res.add(temp.get(i));
        }
        return res;
    }
    static void addleaf(node root, ArrayList<Integer> res)
    {
        if(isLeaf(root))
        {
            res.add(root.data);
            return;
        }

        if(root.left != null) addleaf(root.left, res);
        if(root.right != null) addleaf(root.right, res);
    }
    static ArrayList<Integer> boundaryTrav(node root) {
        // code here
        ArrayList<Integer> res= new ArrayList<>();
        if(root == null) return res;

        if(!isLeaf(root)) res.add(root.data);

        addleft(root, res);
        addleaf(root, res);
        addright(root, res);

        return res;


    }
}
