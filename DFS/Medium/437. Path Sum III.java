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

    private static int cnt = 0;

    private static void Helper(TreeNode root,long sum,int target){

        if(root == null)return ;

        sum += root.val;
        if(sum == target){
            cnt++;
        }

         Helper(root.left,sum  , target);
         Helper(root.right,sum  , target);

        return ;

    }

    public void inorder(TreeNode root,int targetSum){
        if(root==null)return ;

        inorder(root.left,targetSum);
        Helper(root,(long)0,targetSum);
        inorder(root.right,targetSum);
    }

    public int pathSum(TreeNode root, int targetSum) {
        if(root==null)return 0;
        cnt = 0;
        inorder(root,targetSum);
        return cnt;
    }
}
