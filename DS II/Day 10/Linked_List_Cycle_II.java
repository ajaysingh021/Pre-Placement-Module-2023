/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
public ListNode detectCycle(ListNode head) {
HashSet s=new HashSet<>();
int count=0;
while(head!=null){
count++;
if(s.contains(head)){

            return head;
        }
        s.add(head);
        head=head.next;
    }
 
    return head;
}
}