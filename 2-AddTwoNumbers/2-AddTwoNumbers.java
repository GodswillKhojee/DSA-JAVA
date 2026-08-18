// Last updated: 18/08/2026, 20:30:28
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode t = new ListNode(-1);
        ListNode n = t;
        int rem = 0;
        while(t1 != null || t2!=null || rem  != 0)
        {
            int sum = rem;

            if (t1 != null) {
                sum += t1.val;
                t1 = t1.next;
            }

            if (t2 != null) {
                sum += t2.val;
                t2 = t2.next;
            }
            int Nsum = sum % 10;
            rem = sum /10;
            ListNode temp = new ListNode(Nsum);
            n.next = temp;
            n = temp;
        }
        return t.next;
    }
}