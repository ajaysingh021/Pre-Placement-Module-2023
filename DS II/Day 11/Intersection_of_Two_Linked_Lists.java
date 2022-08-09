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
    public int getLength(ListNode head) {
        return head == null ? 0 : 1 + getLength(head.next);
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int la = getLength(headA);
        int lb = getLength(headB);
        
        ListNode big = headA;
        ListNode small = headB;
        int d = la - lb;
        
        if(d < 0) {
            big = headB;
            small = headA;
            d = -d;
        }
        
        for(int i = 0; i < d; i++) {
    	    big = big.next;
        }
        
        while(big != null && small != null) {
            if(big == small)
                return big;
            big = big.next;
            small = small.next;
        }
        
        return null;
    }
}