/*
Given a linked list, swap every two adjacent nodes and return its head.

For example,
Given 1->2->3->4, you should return the list as 2->1->4->3.

Your algorithm should use only constant space. You may not modify the values in the list, only nodes itself can be changed.
*/

public class Solution {
    
	//Recursive
	public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        
        ListNode newHead = head.next;
        head.next = swapPairs(head.next.next);
        newHead.next = head;
        
        return newHead;
    }
	//Non - Recursive
	 public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode prev = dummy;
        ListNode p1 = head, p2 = head.next;
        
        while(p1 != null && p2 != null){
            prev.next = p2;
            ListNode temp = p2.next;
            p2.next = p1;
            
            prev = p1;
            p1.next = temp;
            p1 = temp;
            if(temp != null){
               p2 = temp.next; 
            }
        }
        return dummy.next;
    }
}
