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
    public int len(ListNode head){
        int count=0;
        while(head != null){
            count++;
        }
        return count;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        int n = len(head);
        int grp = n/k;

        ListNode prevHead = null;
        ListNode currHead = head;
        ListNode ans = null;

        for(int i=0;i<grp;i++){
            ListNode prev = null;
            ListNode curr = head;
            ListNode next = null;
        //REV K-G
                for(int j=0;j<k;j++){
                    next = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = next;
                }
                if(prevHead == null){
                    ans = prev;
                }
                else{
                    prevHead.next = prev;
                }
                prevHead = currHead;
                currHead = curr;
        }
        //link last grp
        prevHead.next = currHead;
        return ans;
    }
}