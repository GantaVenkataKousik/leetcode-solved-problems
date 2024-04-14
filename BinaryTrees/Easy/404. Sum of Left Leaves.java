/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {

    private int sumLeft(TreeNode root,int direction){
        if(root==null)return 0;
        int sum = 0;
        if(root.left==null && root.right==null && direction==-1)return root.val; 
        sum += sumLeft(root.left , -1);
        sum += sumLeft(root.right , 1);

        return sum ;
    }

    public int sumOfLeftLeaves(TreeNode root) {
        return sumLeft(root , 0);
    }
}
