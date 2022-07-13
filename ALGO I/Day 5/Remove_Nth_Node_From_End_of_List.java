class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr = head;
        int count = 0;
        while(curr != null) {
            count++;
            curr = curr.next;
        }
        
        int nL = count-n;
        System.out.println(nL);
        if(count==1){
            head = null;
            return head;
        }
        if(nL==0){
            head = head.next;
            return head;
        }
        
        curr = head;
        for(int i=0; i<=nL; i++){
            if(i==nL-1){
                curr.next = curr.next.next;
                break;
            }
            curr = curr.next;
        }
        
        return head;
    }
}