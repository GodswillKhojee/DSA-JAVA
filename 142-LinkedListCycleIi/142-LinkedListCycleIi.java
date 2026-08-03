// Last updated: 03/08/2026, 21:16:37
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null) return null;
        if(head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            if(slow == null) return null;
            
            // if(fast.next == null) return null;
            fast = fast.next.next;
            if(fast == null || fast.next == null) return null;
            
            if(fast == slow) break;
        }
        while(temp!=slow  ){
            temp = temp.next;
            slow = slow.next;
        }
        return temp;
    }
}