
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null)return null;
        ListNode slow = head ,fast = head;
        do{
            fast  = fast.next.next;
            slow = slow.next;
            if(fast ==  slow){
                break;
            }
        }while(fast!=null && fast.next!=null);
        if(fast==null || fast.next==null)return null;

        fast = head;
        while(fast!=slow){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
        
        
    }
}
