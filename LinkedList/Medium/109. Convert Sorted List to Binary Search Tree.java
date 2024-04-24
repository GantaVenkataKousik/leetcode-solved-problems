
class Solution {
    
    public TreeNode sortedListToBST(ListNode head) {
        return construct(head,null);
    }
    
    private TreeNode construct(ListNode head, ListNode tail){
        if(head==tail) return null;
        ListNode fs = head;
        ListNode sl = head;
        while(fs!=tail && fs.next!=tail){
            fs = fs.next.next;
            sl = sl.next;
        }
        TreeNode node = new TreeNode(sl.val);
        node.left = construct(head,sl);
        node.right = construct(sl.next,tail);
        return node;
    }
}
