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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)return null;
        if(head.next == null){
            if(n==0)return head;
            if(n==1)return null;
        }
        int cnt = 0;
        for(ListNode temp = head ; temp!=null ; temp = temp.next){
            cnt++;
        }
        if(n>cnt)return head;
        int pos = cnt-n;
        if(pos==0)return head.next;
        if(pos==1){ head.next = head.next.next;
                    return head;
        }   
        ListNode temp = head;
        for(int i=1 ; i<pos ; i++){
            temp = temp.next;
        }
        if(temp.next!=null){
        temp.next = temp.next.next;
        }
        return head;
    }
}
