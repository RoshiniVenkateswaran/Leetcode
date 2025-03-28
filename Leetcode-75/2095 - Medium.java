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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp=head;
        ListNode prev=null;
        int c=0;
        if (head == null || head.next == null) return null;
        while(temp!=null){
            temp=temp.next;
            c++;
        }
        temp=head;
        for(int i=0;i<c/2;i++){
            prev=temp;
            temp=temp.next;
        }
        
      
        prev.next=temp.next;
        return head;
    }
}
