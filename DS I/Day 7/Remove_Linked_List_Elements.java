class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
        while(temp != null){
            if(temp.val == val && head == temp){
                head = head.next;
                temp = head;
            }else{
                if(temp.next != null){
                    if(temp.next.val == val){
                        if(temp.next.next != null){
                            temp.next = temp.next.next;
                        }else{
                            temp.next = null;
                        }
                    }
                }
                if(temp.next != null && temp.next.val != val){
                    temp = temp.next;
                }else if(temp.next == null){
                    temp = temp.next;
                }
            }
        }
        return head;
    }
}