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
        ListNode ptra = headA;
        ListNode ptrb = headB;

        while(ptra != ptrb){
            if(ptra != null){
                ptra = ptra.next;
            }else{
                ptra = headB;
            }

            if(ptrb != null){
                ptrb = ptrb.next;
            }else{
                ptrb = headA;
            }
        }
        return ptra;
    }
}