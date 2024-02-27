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

    public int max = Integer.MIN_VALUE;

    public int Helper(TreeNode root){
        if(root==null)return 0;
        int left = Helper(root.left);
        int right = Helper(root.right);

        max = Math.max(max,left+right+1);
        return Math.max(left,right)+1; 
    }

    public int diameterOfBinaryTree(TreeNode root) {
        Helper(root);
        int ans = max-1;
        max = Integer.MIN_VALUE;
        return ans;
    }
}
