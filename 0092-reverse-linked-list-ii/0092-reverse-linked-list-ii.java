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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || head.next == null || left == right){
            return head;
        }
            //for returning
        ListNode temp = new ListNode(0);
        temp.next = head;

            //go before left
        ListNode before = temp;
        for(int i=1;i<left;i++){
            before = before.next;
        } 

            //reverse
        ListNode prev = null;
        ListNode curr = before.next;

        for(int i=0;i<right-left+1;i++){
           ListNode next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

            //connect
        before.next.next = curr;
        before.next = prev;


            return temp.next;
    }
}