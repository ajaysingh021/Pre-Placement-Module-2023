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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode pivNode = null;
        ListNode next = null;
        ListNode currNode = head;
        int count=0;
        
        int  i = 1;
        ListNode temp = head;
        while(i<k && temp.next != null){
            temp = temp.next;
            i++;
        }
        
         if(temp.next == null && i<k) return head;

        
        while(currNode!=null && count < k){
            next = currNode.next;
            currNode.next = pivNode;

            pivNode = currNode;
            currNode = next;
            count++;
        }
        if (next != null)
            head.next = reverseKGroup(next, k);

        return pivNode;
    }
}