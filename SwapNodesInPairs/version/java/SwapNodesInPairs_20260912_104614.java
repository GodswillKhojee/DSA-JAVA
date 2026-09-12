// Last updated: 12/09/2026, 10:46:14
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode swapPairs(ListNode head) {
13        if(head == null) return null;
14        Queue<Integer> q = new LinkedList<>();
15
16        Queue<Integer> e = new LinkedList<>();
17        Queue<Integer> o = new LinkedList<>();
18
19        ListNode temp = head;
20        while(temp!=null)
21        {
22            q.add(temp.val);
23            temp = temp.next;
24        }
25        while(!q.isEmpty())
26        {
27            o.add(q.poll());
28            if(!q.isEmpty()) e.add(q.poll());
29        }
30        ListNode newNode = new ListNode(-1);
31        ListNode newTemp = newNode;
32
33        while(!e.isEmpty())
34        {
35            ListNode n = new ListNode(e.poll());
36            newNode.next = n;
37            newNode = n;
38            ListNode n2 =new ListNode(o.poll());
39            newNode.next = n2;
40            newNode = n2;
41        }
42        if(!o.isEmpty()) newNode.next = new ListNode(o.poll());
43        return newTemp.next;
44    }
45}