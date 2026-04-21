package binary_tree;
import java.util.*;
public class levelOrderTraversal {
    public static void main(String[] args) {
        node root = new node(1);
        root.left = new node(2);
        root.right = new node(3);
        root.right.left = new node(5);
        System.out.println(levelOrder(root));
    }
    public static List<List<Integer>> levelOrder(node root) {
        Queue<node> queue = new LinkedList<node>();
        List<List<Integer>> wrap = new LinkedList<List<Integer>>();
        if(root == null) return wrap;
        queue.offer(root);
        while(!queue.isEmpty())
        {
            int levelNum = queue.size();
            List<Integer> list = new LinkedList<Integer>();
            for(int i = 0; i < levelNum;i++)
            {
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                list.add(queue.poll().data);
            }
            wrap.add(list);
        }
        return wrap;
    }
}
