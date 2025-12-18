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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        }
        int x = len(head);

        if (n == x) {
            return head.next;
        }

        ListNode temp = head;

        for (int i = 0; i < x - n-1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;

        return head;
    }

    int len(ListNode head) {
        ListNode temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}