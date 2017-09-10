/*
Write a program to find the node at which the intersection of two singly linked lists begins.


For example, the following two linked lists:

A:          a1 → a2
                   ↘
                     c1 → c2 → c3
                   ↗            
B:     b1 → b2 → b3
begin to intersect at node c1.

*/


public class Solution {
    public int getSize(ListNode cur){
        int count = 0;
        while(cur != null){
            count ++;
            cur = cur.next;
        }
        return count;
    }
    
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int m = getSize(headA);
        int n = getSize(headB);
        int i=0;
        ListNode p1 = headA, p2 = headB;
        if(m > n){
            i=0;
            while(i<(m-n)){
                i++;
                p1 = p1.next;
            }
        }else{
            i=0;
            while(i<(n-m)){
                i++;
                p2 = p2.next;
            }
        }
        
        while(p1 != null && p2 != null){
            if(p1.val == p2.val){
                return p1;   
            }
            p1 = p1.next;
            p2 = p2.next;
        }
    return null;
    }
}