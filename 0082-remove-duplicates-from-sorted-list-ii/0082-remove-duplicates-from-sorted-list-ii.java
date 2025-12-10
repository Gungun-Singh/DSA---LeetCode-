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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode temp = new ListNode(0);
        temp.next = head;

        ListNode prev = temp; //Last unique node
        ListNode curr = head; //to check and delete if duplicate

        while (curr != null) {
            if (curr.next != null && curr.val == curr.next.val) {
                int dup = curr.val;

             while (curr != null && curr.val == dup) {
                    curr = curr.next;
                }
                prev.next = curr;
            }

            else {
                prev = prev.next;
                curr = curr.next;
            }
        }
        return temp.next;
    }
}