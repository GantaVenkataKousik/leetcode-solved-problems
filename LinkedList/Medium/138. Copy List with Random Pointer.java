/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        HashMap<Node,Node> hm = new HashMap<>();
        Node curr = head;
        //Creating cloned nodes of original linked list
        while(curr!=null){
            hm.put(curr,new Node(curr.val));
            curr = curr.next;
        }
        //creating the next pointers & random pointers of this cloned nodes
        // as like  the original linked list
        for(curr=head;curr!=null;curr=curr.next){
            Node clonedNode = hm.get(curr);
            clonedNode.next = hm.get(curr.next);
            clonedNode.random = hm.get(curr.random);
        }
        return hm.get(head);
        
    }
}
