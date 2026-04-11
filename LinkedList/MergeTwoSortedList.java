package LinkedList;

class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class MergeTwoSortedList {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode temp1 = list1;
        ListNode temp2 = list2;

        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (temp1 != null && temp2 != null) {
            if (temp1.val < temp2.val) {
                temp.next = temp1;
                temp1 = temp1.next;
            } else {
                temp.next = temp2;
                temp2 = temp2.next;
            }
            temp = temp.next;
        }

        if (temp1 != null) {
            temp.next = temp1;
        } else {
            temp.next = temp2;
        }

        return dummy.next;
    }

    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        ListNode list1 = new ListNode(1,
                new ListNode(3,
                        new ListNode(5)));

        ListNode list2 = new ListNode(2,
                new ListNode(4,
                        new ListNode(6)));

        MergeTwoSortedList obj = new MergeTwoSortedList();

        ListNode result = obj.mergeTwoLists(list1, list2);

        printList(result);
    }
}