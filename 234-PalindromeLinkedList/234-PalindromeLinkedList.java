// Last updated: 03/08/2026, 21:15:48
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
    public boolean isPalindrome(ListNode head) {
        ListNode temp = head;
      int n = 0;
      while(temp !=null)
      {
          n++;
          temp = temp.next;
      }
    int [] arr = new int[n];
      temp = head;
      int x = 0;
      
      while(temp!=null)
      {
          arr[x++] = temp.val;
          temp = temp.next;
      }
      int i =0;
      int j = n-1;
      boolean ist = true;
      while(i<=j)
      {
          if(arr[i++] != arr[j--]) ist = false;
      }
      return ist;
    }
}