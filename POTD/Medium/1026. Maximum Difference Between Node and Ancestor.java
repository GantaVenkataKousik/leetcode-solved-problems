class Solution {

    private int diff = 0;

    private void Helper(TreeNode root,int min,int max){
        if(root==null)return ;

        diff = Math.max(diff,Math.max(Math.abs(root.val - min),Math.abs(root.val-max)));
        min = Math.min(root.val , min);
        max = Math.max(root.val , max);

        Helper(root.left,min,max);
        Helper(root.right,min,max);
    }

    public int maxAncestorDiff(TreeNode root) {
        if(root == null)return 0;
        int min = root.val , max = root.val;
        Helper(root,min,max);
        return diff;
    }
}
