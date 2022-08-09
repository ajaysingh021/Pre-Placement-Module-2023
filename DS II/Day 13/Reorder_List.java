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
    public void reorderList(ListNode head) {
        ListNode temp = head;
        ListNode midToEnd = reverseList(middleNode(temp));
        ListNode newHead = new ListNode();
        ListNode newHeadTracker = new ListNode();
        newHeadTracker.next=head;
        while (midToEnd != null && head.next!=null) {
            newHead.next=head;
            head = head.next;
            newHead=newHead.next;
            newHead.next=midToEnd;
            midToEnd = midToEnd.next;
            newHead=newHead.next;
        }
        head= newHeadTracker.next;
    }
    public static ListNode middleNode(ListNode head) {
        ListNode mid = head;
        while (head != null && head.next != null) {
            mid = mid.next;
            head = head.next.next;
        }
        return mid;
    }
    
     public static ListNode reverseList(ListNode head) {
        ListNode newHead = null;
        while (head != null) {
            ListNode restList = head.next;
            ListNode tempNewNode = head;
            tempNewNode.next = newHead;
            newHead = tempNewNode;
            head = restList;
        }
        return newHead;
    }
}