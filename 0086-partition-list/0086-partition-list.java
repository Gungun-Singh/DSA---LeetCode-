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
    public ListNode partition(ListNode head, int x) {
        
    if(head ==null || head.next == null) return head;

    
    ListNode smallH = new ListNode(0);
    ListNode bigH = new ListNode(0);

    ListNode small = smallH;
    ListNode big = bigH;

    ListNode temp = head;

    while(temp != null){
        if(temp.val<x){
            small.next = temp;
            small= small.next;
        }
        else{
            big.next = temp;
            big = big.next;
        }
        temp = temp.next;
    }

    big.next = null;
    small.next = bigH.next;

    return smallH.next;

    }
}