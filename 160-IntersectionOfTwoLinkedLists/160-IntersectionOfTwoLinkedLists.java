// Last updated: 03/08/2026, 21:16:23
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int s1 = 0;
        int s2 = 0;
        //for the size;
        while(temp1 != null)
        {
         temp1 = temp1.next;
         s1++;
        }
        while(temp2 != null)
        {
         temp2 = temp2.next;
         s2++;
        }
        int sMax = 0;
        if(s1>s2){
            sMax = s1-s2;
        }
        else{
            sMax = s2-s1;
        }
        temp1 = headA;
        temp2 = headB;
        for(int i = 0; i<sMax;i++){
            if(s1>s2){
                temp1=temp1.next;
            }
            else
            {
                temp2=temp2.next;
            }
        }
        while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;
    }
}