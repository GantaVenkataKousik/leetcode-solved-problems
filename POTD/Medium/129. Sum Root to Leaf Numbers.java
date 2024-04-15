class Solution {
    int sum = 0;
    int totalSum = 0;
    public void sumNumbersHelper(TreeNode root,int sum){
        if(root == null)return ;

        sum = sum*10 + root.val;

        if(root.left == null && root.right==null){
            totalSum += sum;
            return ;
        }
        
        
        sumNumbersHelper(root.left,sum);
        sumNumbersHelper(root.right,sum);
    }

    public int sumNumbers(TreeNode root) {
            sumNumbersHelper(root,sum);
            return totalSum;
    }
}
