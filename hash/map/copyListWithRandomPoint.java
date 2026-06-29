package hash.map;

import binary_tree.node;
import java.util.*;
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class copyListWithRandomPoint {
    public Node copyList(Node head)
    {
        Node temp1 = head;
        Node head2 = new Node(-1);
        Node temp2 = head2;
        while(temp1!=null)
        {
            Node t = new Node(temp1.val);
            temp2.next = t;
            temp2 = temp2.next;
            temp1 = temp1.next;
        }
        return head2.next;
    }
    public Node copyRandomList(Node a) {
        Node b = copyList(a);
        HashMap<Node, Node> map = new HashMap<>();
        Node ta = a;
        Node tb = b;
        map.put(null,null);
        while(ta != null)
        {
            map.put(ta,tb);
            ta = ta.next;
            tb = tb.next;
        }
        ta = a;
        while(ta != null)
        {
            tb = map.get(ta);
            tb.random = map.get(ta.random);
            ta = ta.next;
        }
        return b;
    }
}
