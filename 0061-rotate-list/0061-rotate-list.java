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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next ==null){
            return head;
        }

        ListNode temp = head;
        int len=1;

        while(temp.next != null){
            len++;
            temp = temp.next;
        }

        k = k%len;
        if(k == 0){
            return head;
        }

        temp.next = head;

        ListNode node = head;

        int steps = len-k;

        for(int i=1; i<steps;i++){
            node = node.next;
        }

        ListNode newHead = node.next;
        node.next = null;

        return newHead;
    }
}