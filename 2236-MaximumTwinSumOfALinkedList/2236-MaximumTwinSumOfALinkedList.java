// Last updated: 03/08/2026, 21:13:46
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
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next.next!= null && fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        ListNode curr = slow.next;
        ListNode agla = slow.next;
        while(curr != null)
        {
            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        }
        int max = Integer.MIN_VALUE;
        ListNode t1 = head;
        ListNode t2 = prev;
        while(t2 != null)
        {
            if(max < t1.val + t2.val)
            {
                max = t1.val + t2.val;
            }
            t1 = t1.next;
            t2 = t2.next;
        }
        return max;
    }
}