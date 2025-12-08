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
    public ListNode reverseList(ListNode head) {
    
                                 //3 APPROACHES
//REC
//  if (head == null || head.next == null) {
//             return head;
//         }

// ListNode newHead= reverseList(head.next);
// ListNode temp = head.next;
// temp.next =head;

// head.next =null;


// return newHead;



    //     ListNode temp = head;
    //     Stack<Integer> st = new Stack<>();

    //     while(temp != null){
    //         st.push(temp.val);

    //         temp = temp.next;
    //     }

    //     temp = head;

    //     while(temp!= null){
    //         temp.val = st.pop();

    //         temp=temp.next;
    //     }

    // return head;


 
// ListNode prev = null;
// ListNode curr = head;

// ListNode next = null;

// while(curr != null){
//     next = curr.next;
//     curr.next = prev;
    
//     prev = curr;
//     curr = next;    
// }

// return prev;




ListNode prev = null;
ListNode curr = head;
ListNode next = null;

while(curr != null){
    next = curr.next;
    curr.next = prev;

    prev = curr;
    curr = next;
}
return prev;


    }
}