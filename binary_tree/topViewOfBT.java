package binary_tree;

import java.util.*;

public class topViewOfBT {
    static public ArrayList<Integer> topView(node root) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) return res;
        check(root, res);
        return res;
    }
    static int check(node root, ArrayList<Integer> res)
    {
        if(root == null) return 0;
        int l = check(root.left, res);
        res.add(l);
        int r = check(root.right ,res);
        res.add(r);

        return Math.max(l,r)+1;
    }
}
