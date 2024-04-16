class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {

        if(depth == 1){
            TreeNode valnode1 =  new TreeNode(val);
            valnode1.left = root; 
            return valnode1;
        }

        Queue<TreeNode> q = new LinkedList<>();
        TreeNode rootleft,rootright;
        q.offer(root);
        int dep = 2;
        while(!q.isEmpty()){
            int s = q.size();
            if(dep == depth){

                TreeNode node1,node2,node;
                while(!q.isEmpty()){

                    node1 = new TreeNode(val);
                    node2 = new TreeNode(val);
                    node = q.poll();

                    rootleft = node.left;
                    rootright = node.right;

                    node.left = node1;
                    node.right = node2;

                    node1.left = rootleft;
                    node2.right = rootright;  
                    
                }
            }else{
                for(int i = 0; i<s; i++){
                    TreeNode node = q.poll();
                    if(node.left != null) q.offer(node.left);
                    if(node.right != null) q.offer(node.right);
                }
            }
            dep++;
        }
        return root;
    }
}
