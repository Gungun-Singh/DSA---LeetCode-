class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    if(list1==null) return list2;
    if(list2==null) return list1;


ListNode temp = new ListNode(0);
ListNode head = temp;

    while(list1!=null && list2!=null){
if(list1.val<list2.val){
    ListNode newNode = new ListNode(list1.val);
    temp.next = newNode;
    list1 = list1.next; 

}   else{
    ListNode newNode = new ListNode(list2.val);
    temp.next = newNode;
    list2 = list2.next;
     
}
temp = temp.next;
    }
if(list1!=null) temp.next = list1;
if(list2!=null) temp.next = list2;
return head.next;
    
    


















}   }