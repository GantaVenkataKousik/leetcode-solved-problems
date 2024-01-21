class Solution {

    private static int maxAmount(int[] nums,int n,int dp[]){
        if(n<0)return 0;
        if(n==0)return nums[0];
        if(n==1)return Math.max(nums[0],nums[1]);

        if(dp[n]!=-1)return dp[n];

        dp[n] = Math.max(nums[n]+maxAmount(nums,n-2,dp),0+maxAmount(nums,n-1,dp));

        return dp[n];

    }

    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        for(int i=0 ; i<n  ; i++){
            dp[i] = -1;
        }
        return maxAmount(nums,n-1,dp);
    }
}
