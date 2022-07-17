class Solution {
    public ListNode reverseList(ListNode head) {
        
        if(head == null){
          return null;
        }
        ListNode res = null;
        ListNode temp;
        
        while(head!=null){
            temp = new ListNode(head.val);
            temp.next = res;
            res = temp;
            head = head.next;            
        }
        
        return res;
    }
}