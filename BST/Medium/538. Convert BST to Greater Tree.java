class Solution {
    public void traverse(TreeNode root,Stack<TreeNode> st){
        if(root==null)return ;
        traverse(root.left,st);
        st.push(root);
        traverse(root.right,st);
    }

    public TreeNode convertBST(TreeNode root) {
        Stack<TreeNode> st = new Stack<>();
        traverse(root,st);
        int sum = 0;
        while(!st.isEmpty()){
            TreeNode node = st.pop();
            sum += node.val;
            node.val = sum;
        }
        return root;
    }
}
