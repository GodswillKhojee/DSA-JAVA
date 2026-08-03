// Last updated: 03/08/2026, 21:16:33
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
    public ListNode sortList(ListNode head) {
        if(head==null) return null;
        ListNode temp = head;
        int n = 0;
        while(temp!=null)
        {
            n++;
            temp = temp.next;
        }
        temp = head;
        int [] a = new int[n];
        int x = 0;
        while(temp!=null)
        {
            
            a[x] = temp.val;
            temp = temp.next; 
            x++;
        }
        Arrays.sort(a);
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        for (int val : a) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }

        return dummy.next;

    }
}