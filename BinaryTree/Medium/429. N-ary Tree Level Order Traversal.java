class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null)return ans;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n = q.size();
            List<Integer> l= new ArrayList<>();
            for(int i=0 ; i<n  ;i++){
                Node node = q.poll();
                l.add(node.val);
                List<Node> children = node.children;
                for(Node temp : children){
                    q.add(temp);
                }
            }
            ans.add(l);
        }
        return ans;
    }
}
