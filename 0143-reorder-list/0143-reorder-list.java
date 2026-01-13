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
    public void reorderList(ListNode head) {
        if(head == null || head.next ==null || head.next.next ==null){
            return;
        }

        //FIND MIDDLE
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode head2 = slow.next;
        slow.next = null;


        //REV SECOND LIST
        ListNode prev = null;
        ListNode curr = head2;

        while(curr != null){
        ListNode nex = curr.next;
            curr.next = prev;

            prev = curr;
            curr = nex;
        }

        ListNode a = head;
        ListNode b = prev;

          //merge...........REVISE
        while(b != null){
        ListNode t1 = a.next;
        ListNode t2 = b.next;

        a.next= b;
        b.next = t1;

        a= t1;
        b= t2;

        }
    }
}